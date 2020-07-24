/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import components.Mailer2;
import entity.Depart;
import entity.Record;
import entity.Staff;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("/admin/staff")
public class StaffController {
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
    @RequestMapping("/index")
	public String index(ModelMap model) {
		model.addAttribute("staff", new Staff());
		model.addAttribute("staffs", getStaff());
		return "admin/staff/show-staff";
	}
    @SuppressWarnings("unchecked")
	public List<Staff> getStaff() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Staff";
		Query query = session.createQuery(hql);
		List<Staff> list = query.list();
		return list;
	}
    @RequestMapping("insert")
        public String insert(ModelMap model, @ModelAttribute("staff") Staff staff, BindingResult errors) {
                Session session = factory.openSession();
                Transaction t = session.beginTransaction();
                try {

                        session.save(staff);
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
                model.addAttribute("staffs", getStaff());
                return "admin/staff/show-staff";
        }
        @RequestMapping("delete/{id}")
	public String delete(ModelMap model, @PathVariable("id") String id) {
		Session session = factory.getCurrentSession();
		Staff staff = (Staff) session.get(Staff.class, id);
		session.delete(staff);
                model.addAttribute("message", "Xóa thành công !");
                model.addAttribute("staff", new Staff());
		model.addAttribute("staffs", getStaff());
		return "admin/staff/show-staff";
	}
        @RequestMapping("upd/{id}")
	public String update(ModelMap model, @PathVariable("id") String id) {
		Session session = factory.getCurrentSession();
		Staff staff = (Staff) session.get(Staff.class, id);
                model.addAttribute("avt", staff.getPhoto());
		model.addAttribute("staff", staff);
		model.addAttribute("staffs", getStaff());
		return "admin/staff/update-staff";
	}
        @RequestMapping("update")
	public String updateStaff(ModelMap model, @ModelAttribute("staff") Staff staff) {
		Session session = factory.getCurrentSession();
		session.update(staff);
		model.addAttribute("message", "Cập nhật thành công !");
                model.addAttribute("staffs", getStaff());
                model.addAttribute("avt", staff.getPhoto());
		return "admin/staff/update-staff";
	}
        @RequestMapping("updateimg")
	public String updateimgStaff(ModelMap model, @RequestParam("id") String id,  
                @RequestParam("photo") MultipartFile image)
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
		return "admin/staff/update-staff";
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
        @SuppressWarnings("unchecked")
	public List<Record> getRecord() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Record r ORDER by r.date desc";
		Query query = session.createQuery(hql);
		List<Record> list = query.list();
		return list;
	}
        @RequestMapping("assess/{id}")
	public String assess(ModelMap model, @PathVariable("id") String id) {
		Session session = factory.getCurrentSession();
		Staff staff = (Staff) session.get(Staff.class, id);
		model.addAttribute("staffid", staff);
                model.addAttribute("records", getRecord());
		return "admin/record/show-record";
	}
}
