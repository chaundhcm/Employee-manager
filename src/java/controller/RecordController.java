/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import components.Mailer2;
import entity.Depart;
import entity.Record;
import entity.Select;
import entity.Staff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("/admin/record")
public class RecordController {
    @Autowired
    SessionFactory factory;
    
    @Autowired
    Mailer2 mailer;
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);
    }
    @RequestMapping("/index")
	public String index(ModelMap model) {
		model.addAttribute("record", new Record());
		model.addAttribute("records", getRecord());
		return "admin/record/show-record";
	}
    @SuppressWarnings("unchecked")
	public List<Record> getRecord() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Record r ORDER by r.date desc";
		Query query = session.createQuery(hql);
		List<Record> list = query.list();
		return list;
	}
    @RequestMapping("/search")
	public String searchRecord(ModelMap model, @RequestParam("startdate") String startDate, 
                @RequestParam("enddate") String endDate, @RequestParam("depart_id") String depart_id) {
		Session session = factory.getCurrentSession();
                String hql = "";
                String where = "";
                if(depart_id.equals("All")){
                    if(startDate.equals("") && endDate.equals("")){
                        where = " ";
                    }else if(endDate.equals("")){
                        where = "where r.date >= '"+startDate+"' ";
                    }else if(startDate.equals("")){
                        where = "where r.date <= '"+endDate+"' ";
                    }else{
                        where = "where date BETWEEN '"+startDate+"' and '"+endDate+"' ";
                    }
                }else{
                    if(startDate.equals("") && endDate.equals("")){
                        where = "where r.staff.depart.id = '"+depart_id+"' ";
                    }else if(endDate.equals("")){
                        where = "where r.date >= '"+startDate+"' and r.staff.depart.id = '"+depart_id+"' ";
                    }else if(startDate.equals("")){
                        where = "where r.date <= '"+endDate+"' and r.staff.depart.id = '"+depart_id+"' ";
                    }else{
                        where = "where date BETWEEN '"+startDate+"' and '"+endDate+"' and r.staff.depart.id = '"+depart_id+"' ";
                    }
                }
                hql = "FROM Record r "
                            + where
                            + " ORDER by r.date desc";    
		Query query = session.createQuery(hql);
		List<Record> list = query.list();
                model.addAttribute("records", list);
                model.addAttribute("startdate", startDate);
                model.addAttribute("enddate", endDate);
                model.addAttribute("depart_id", depart_id);
		return "admin/record/show-record";
	}
    @RequestMapping("insert")
        public String insert(ModelMap model, @ModelAttribute("record") Record record) {
                Session session = factory.openSession();
                Transaction t = session.beginTransaction();
                try {
                        session.save(record);
                        t.commit();
                        model.addAttribute("message", "Thêm thành công !");
                } 
                catch (Exception e) {
                        t.rollback();
                        model.addAttribute("message", "Thêm thất bại !");
                }
                finally {
                        session.close();
                }
                model.addAttribute("records", getRecord());
                return "admin/record/show-record";
        }
        @RequestMapping("delete/{id}")
	public String delete(ModelMap model, @PathVariable("id") int id) {
		Session session = factory.getCurrentSession();
		Record record = (Record) session.get(Record.class, id);
		session.delete(record);
                model.addAttribute("message", "Xóa thành công !");
                model.addAttribute("record", new Record());
		model.addAttribute("records", getRecord());
		return "admin/record/show-record";
	}
        @RequestMapping("upd/{id}")
	public String update(ModelMap model, @PathVariable("id") int id) {
		Session session = factory.getCurrentSession();
		Record record = (Record) session.get(Record.class, id);
		model.addAttribute("record", record);
		model.addAttribute("records", getRecord());
		return "admin/record/update-record";
	}
        @RequestMapping("update")
	public String updateRecord(ModelMap model, @ModelAttribute("record") Record record) {
		Session session = factory.getCurrentSession();
		session.update(record);
		model.addAttribute("message", "Cập nhật thành công !");
                model.addAttribute("records", getRecord());
		return "admin/record/update-record";
	}
        @ModelAttribute("departs")
	@SuppressWarnings("unchecked")
	public List<Depart> getDepart() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Depart";
		Query query = session.createQuery(hql);
		List<Depart> list = query.list();
		return list;
	}
        @ModelAttribute("staffs")
	@SuppressWarnings("unchecked")
	public List<Staff> getStaff() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Staff";
		Query query = session.createQuery(hql);
		List<Staff> list = query.list();
		return list;
	}
        @RequestMapping("maildanhgia/{id}")
        public String maildanhgia(ModelMap model, @PathVariable("id") int id) {
                Session session = factory.getCurrentSession();
		Record record = (Record) session.get(Record.class, id);
                String loai = "";
                Boolean type = record.getType();
                if(type==true){
                    loai = "Thành tích";
                }else{
                    loai = "Kỷ luật";
                }
                String from = "chaundps09898@fpt.edu.vn";
                String subject = "ABC Group - Đánh Giá";
                String body = "ID: "+record.getStaff().getId()+
                              "\r\n | Tên: "+record.getStaff().getName()+
                              "\r\n | Phòng Ban: "+record.getStaff().getDepart().getName()+
                              "\r\n | Loại: "+loai+
                              "\r\n | Lý do: "+record.getReason()+
                              "\r\n | Ngày: "+record.getDate();
                String cc = "nguyendinhchau1010@gmail.com";
                String bcc = "nguyendinhchau1010@gmail.com";
                System.out.println(body);
                try{
                // Gửi mail
                mailer.send(from, record.getStaff().getEmail(), cc, bcc, subject, body);
                model.addAttribute("message", "Gửi mail thành công !");
                }
                catch(Exception ex){
                    model.addAttribute("message", "Gửi mail thất bại !");
                }
                
                model.addAttribute("records", getRecord());
                return "admin/record/show-record";
                }
        public ArrayList<Select> fillAllDepart(){
            ArrayList<Select> ds = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Java5_ASM";
            Connection con = DriverManager.getConnection(url, "sa", "songlong");
            String newSQL = "select * from Departs";
           PreparedStatement ps = con.prepareStatement(newSQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                Select cate = new Select(id, name);
                ds.add(cate);
            }
        } catch (Exception e) {
        }
        return ds;
    }
}
