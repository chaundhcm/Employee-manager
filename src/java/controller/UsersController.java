/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Depart;
import entity.Record;
import entity.Staff;
import entity.User;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("user/")
public class UsersController {
    @Autowired
    SessionFactory factory;
    
    @Autowired
    ServletContext context;
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);
    }
    @RequestMapping("index")
	public String record(ModelMap model, HttpSession httpSession) {
            String id = (String) httpSession.getAttribute("iduser");
            Session session = factory.getCurrentSession();
            String hql = "FROM Staff  "
            + "where Email = '"+id+"'";
            Query query =  session.createQuery(hql);
            List<Staff> list = query.list(); 
            for(Staff s: list){
                httpSession.setAttribute("idstaff", s.getId());
                httpSession.setAttribute("countTT", countTT(s.getId()));
            }
            httpSession.setAttribute("staffs", list);
            model.addAttribute("staff", list);
		return "user/index";
    }
    @RequestMapping("updatestaff")
	public String updateStaff(ModelMap model, HttpSession httpSession) {
            String id = (String) httpSession.getAttribute("idstaff");
            Session session = factory.getCurrentSession();
		Staff staff = (Staff) session.get(Staff.class, id);
                model.addAttribute("avt", staff.getPhoto());
		model.addAttribute("staff", staff);
                model.addAttribute("staffs", getStaff(id));
		return "user/update-info";
    }
    @RequestMapping("updateinfostaff")
	public String updateStaff(ModelMap model, @ModelAttribute("staff") Staff staff) {
		Session session = factory.getCurrentSession();
		session.update(staff);
		model.addAttribute("message", "Cập nhật thành công !");
                model.addAttribute("avt", staff.getPhoto());
		return "redirect:/user/updatestaff.htm";
	}
    @RequestMapping("updateimg")
	public String updateimgStaff(ModelMap model, @RequestParam("id") String id,  
                @RequestParam("photo") MultipartFile image, HttpSession httpSession)
            {
            Session session = factory.getCurrentSession();
            if(image.isEmpty()){
			model.addAttribute("message", "Vui lòng chọn file !");
            }else{
                try {
                        String path = context.getRealPath("/images/"+image.getOriginalFilename());
                        image.transferTo(new File(path));
                        System.out.println(path);
                        model.addAttribute("hinhanh", image.getOriginalFilename());
                        Staff staff = (Staff) session.get(Staff.class, id);
                        staff.setPhoto(image.getOriginalFilename());
                        model.addAttribute("staff", staff);
                        model.addAttribute("avt", staff.getPhoto());
                        model.addAttribute("message", "Cập nhật ảnh thành công !");
                }catch (Exception e) {
				model.addAttribute("message", "Lỗi lưu file !");
		}
            }
                Staff staff = (Staff) session.get(Staff.class, id);
                model.addAttribute("staff", staff);
		return "redirect:/user/updatestaff.htm";
	}
    @RequestMapping("update")
	public String updateUser(ModelMap model, HttpSession httpSession) {
            String id = (String) httpSession.getAttribute("iduser");
            Session session = factory.getCurrentSession();
            User user = (User) session.get(User.class, id);
            model.addAttribute("user", user);
		return "user/account";
    }
    @RequestMapping("updateinf")
    public String updateUserInf(ModelMap model, @ModelAttribute("user") User user) {
            Session session = factory.getCurrentSession();
            session.update(user);
            model.addAttribute("message", "Cập nhật thành công !");
            return "user/account";
    }
    @RequestMapping("record")
	public String getrecord(ModelMap model, HttpSession httpSession) {
            String id = (String) httpSession.getAttribute("idstaff");
            model.addAttribute("records", getrecord1(id));
		return "user/history";
    }    
        public List<Record> getrecord1(String id) {
            Session session = factory.getCurrentSession();
            String hql = "FROM Record r "
            + "where r.staff.id = '"+id+"'";
            Query query =  session.createQuery(hql);
            List<Record> list = query.list(); 
		return list;
    }
        public List<Object[]> countTT(String id) {
            Session session = factory.getCurrentSession();
            String hql = "SELECT "
                + "SUM(case when r.type=1 then 1 else 0 end), "
                + "SUM(case when r.type=0 then 1 else 0 end), "
                + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) "
                + "FROM Record r "
                + "WHERE r.staff.id = '"+id+"' ";
            Query query = session.createQuery(hql);
            List<Object[]> list = query.list();
            return list;
    }
            public List<Staff> getStaff(String id) {
            Session session = factory.getCurrentSession();
            String hql = "FROM Staff "
            + "where id = '"+id+"'";
            Query query =  session.createQuery(hql);
            List<Staff> list = query.list(); 
		return list;
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

       
    
    @RequestMapping("bxh")
    public String top10(ModelMap model) {
            Session session = factory.getCurrentSession();
            String hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
            + "FROM Record r "
            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(3);
            query.setMaxResults(7);
            List<Object[]> list = query.list();
            model.addAttribute("top10", list);
            model.addAttribute("top1", getTop1());
            model.addAttribute("top2", getTop2());
            model.addAttribute("top3", getTop3());
            return "user/bxh";
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> getTop1() {
            Session session = factory.getCurrentSession();
            String hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
            + "FROM Record r "
            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
            + "ORDER by diem desc";
            List<Object[]> list =  session.createQuery(hql).setMaxResults(1).list();
            return list;
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> getTop2() {
            Session session = factory.getCurrentSession();
            String hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
            + "FROM Record r "
            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(1);
            query.setMaxResults(1);
            List<Object[]> list = query.list();
            return list;
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> getTop3() {
            Session session = factory.getCurrentSession();
            String hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
            + "FROM Record r "
            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(2);
            query.setMaxResults(1);
            List<Object[]> list = query.list();
            return list;
    }
    @RequestMapping("searchtop10")
    public String searchtop10(ModelMap model, @RequestParam("startdate") String startDate, 
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
            hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
                            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(3);
            query.setMaxResults(7);
            List<Object[]> list = query.list();
            model.addAttribute("top10", list);
            model.addAttribute("startdate", startDate);
            model.addAttribute("enddate", endDate);
            model.addAttribute("top1", searchgetTop1(startDate, endDate, depart_id));
            model.addAttribute("top2", searchgetTop2(startDate, endDate, depart_id));
            model.addAttribute("top3", searchgetTop3(startDate, endDate, depart_id));
            return "user/bxh";
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> searchgetTop1(String startDate, String endDate, String depart_id) {
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
            hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
                            + "ORDER by diem desc";
            List<Object[]> list =  session.createQuery(hql).setMaxResults(1).list();
            return list;
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> searchgetTop2(String startDate, String endDate, String depart_id) {
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
            hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
                            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(1);
            query.setMaxResults(1);
            List<Object[]> list = query.list();
            return list;
    }
    @SuppressWarnings("unchecked")
    public List<Object[]> searchgetTop3(String startDate, String endDate, String depart_id) {
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
            hql = "SELECT r.staff.photo, r.staff.name, r.staff.depart.name, "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + "GROUP BY r.staff.photo, r.staff.name, r.staff.depart.name "
                            + "ORDER by diem desc";
            Query query =  session.createQuery(hql);
            query.setFirstResult(2);
            query.setMaxResults(1);
            List<Object[]> list = query.list();
            return list;
    }

    @RequestMapping("logout")
        public String logout(ModelMap model, HttpSession httpSession) {
            httpSession.removeAttribute("iduser");
            httpSession.removeAttribute("nameuser");
            httpSession.removeAttribute("idstaff");
            httpSession.removeAttribute("countTT");
            httpSession.removeAttribute("staffs");
                return "redirect:/home/index.htm";
        }
   
}
