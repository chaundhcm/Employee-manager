/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("admin/user/")
public class UserController {
    @Autowired
    SessionFactory factory;
    
    @RequestMapping("/index")
	public String index(ModelMap model) {
		model.addAttribute("user", new User());
		model.addAttribute("users", getUser());
		return "admin/user/show-user";
	}
    @SuppressWarnings("unchecked")
	public List<User> getUser() {
		Session session = factory.getCurrentSession();
		String hql = "FROM User";
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		return list;
	}
    @RequestMapping("insert")
        public String insert(ModelMap model, @ModelAttribute("user") User user) {
                Session session = factory.openSession();
                Transaction t = session.beginTransaction();
                try {
                        session.save(user);
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
                model.addAttribute("users", getUser());
                return "admin/user/show-user";
        }
    @RequestMapping("delete/{id}")
    public String delete(ModelMap model, @PathVariable("id") String id) {
            Session session = factory.getCurrentSession();
            User user = (User) session.get(User.class, id);
            session.delete(user);
            model.addAttribute("message", "Xóa thành công !");
            model.addAttribute("user", new User());
            model.addAttribute("users", getUser());
            return "admin/user/show-user";
    }
    @RequestMapping("upd/{id}")
    public String update(ModelMap model, @PathVariable("id") String id) {
            Session session = factory.getCurrentSession();
            User user = (User) session.get(User.class, id);
            model.addAttribute("user", user);
            model.addAttribute("users", getUser());
            return "admin/user/update-user";
    }
    @RequestMapping("update")
    public String updateUser(ModelMap model, @ModelAttribute("user") User user) {
            Session session = factory.getCurrentSession();
            session.update(user);
            model.addAttribute("message", "Cập nhật thành công !");
            model.addAttribute("users", getUser());
            return "admin/user/update-user";
    }
    @RequestMapping("top10")
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
            return "admin/user/index";
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
    @RequestMapping("logout")
        public String logout(ModelMap model, HttpSession httpSession) {
            httpSession.removeAttribute("iduser");
            httpSession.removeAttribute("nameuser");
                return "redirect:/home/index.htm";
        }
    @RequestMapping("update-info")
    public String updateInf(ModelMap model, HttpSession httpSession) {
            String id = (String) httpSession.getAttribute("iduser");
            Session session = factory.getCurrentSession();
            User user = (User) session.get(User.class, id);
            model.addAttribute("user", user);
            return "admin/user/update-info";
    }
    @RequestMapping("updateinf")
    public String updateUserInf(ModelMap model, @ModelAttribute("user") User user) {
            Session session = factory.getCurrentSession();
            session.update(user);
            model.addAttribute("message", "Cập nhật thành công !");
            return "admin/user/update-info";
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
            return "admin/user/index";
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
}
