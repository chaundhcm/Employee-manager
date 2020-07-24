/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Depart;
import java.util.List;
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


/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("/admin/depart")
public class DepartController {
    @Autowired
    SessionFactory factory;
    

    @RequestMapping("/index")
	public String index(ModelMap model) {
                model.addAttribute("depart", new Depart());
		model.addAttribute("departs", getDepart());
		return "admin/depart/show-depart";
	}
        @SuppressWarnings("unchecked")
	public List<Depart> getDepart() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Depart";
		Query query = session.createQuery(hql);
		List<Depart> list = query.list();
		return list;
	}    
    
        @RequestMapping("insert")
        public String insert(ModelMap model, @ModelAttribute("depart") Depart depart) {
                Session session = factory.openSession();
                Transaction t = session.beginTransaction();
                try {
                        session.save(depart);
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
                model.addAttribute("departs", getDepart());
                return "admin/depart/show-depart";
        }
        @RequestMapping("delete/{id}")
	public String delete(ModelMap model, @PathVariable("id") String id) {
		Session session = factory.getCurrentSession();
		Depart depart = (Depart) session.get(Depart.class, id);
		session.delete(depart);
                model.addAttribute("message", "Xóa thành công !");
                model.addAttribute("depart", new Depart());
		model.addAttribute("departs", getDepart());
		return "admin/depart/show-depart";
	}
        @RequestMapping("upd/{id}")
	public String update(ModelMap model, @PathVariable("id") String id) {
		Session session = factory.getCurrentSession();
		Depart depart = (Depart) session.get(Depart.class, id);
		model.addAttribute("depart", depart);
		model.addAttribute("departs", getDepart());
		return "admin/depart/update-depart";
	}
        @RequestMapping("update")
	public String updateDepart(ModelMap model, @ModelAttribute("depart") Depart depart) {
		Session session = factory.getCurrentSession();
		session.update(depart);
		model.addAttribute("message", "Cập nhật thành công !");
                model.addAttribute("departs", getDepart());
		return "admin/depart/update-depart";
	}
}
