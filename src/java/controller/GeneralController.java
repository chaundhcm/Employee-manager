/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Record;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("admin/general/")
public class GeneralController {
    @Autowired
    SessionFactory factory;
    
    @RequestMapping("/staff")
    public String listStaff(ModelMap model) {
        Session session = factory.getCurrentSession();
        String hql = "SELECT r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name, "
                + "SUM(case when r.type=1 then 1 else 0 end), "
                + "SUM(case when r.type=0 then 1 else 0 end), "
                + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                + "FROM Record r "
                + "GROUP BY r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name "
                + "ORDER by diem desc";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        model.addAttribute("liststaff", list);
        return "admin/general/staff";
    }
    @RequestMapping("/depart")
    public String listDepart(ModelMap model) {
        Session session = factory.getCurrentSession();
        String hql = "SELECT r.staff.depart.name, "
                + "SUM(case when r.type=1 then 1 else 0 end), "
                + "SUM(case when r.type=0 then 1 else 0 end), "
                + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                + "FROM Record r "
                + "GROUP BY r.staff.depart.name "
                + "ORDER by diem desc";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        model.addAttribute("listdepart", list);
        return "admin/general/depart";
    }
    @RequestMapping("/searchstaff")
	public String searchStaff(ModelMap model, @RequestParam("startdate") String startDate, 
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
                    hql = "SELECT r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name, "
                        + "SUM(case when r.type=1 then 1 else 0 end), "
                        + "SUM(case when r.type=0 then 1 else 0 end), "
                        + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                        + "FROM Record r "
                        + "where r.date <= '"+endDate+"' "
                        + "GROUP BY r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name "
                        + "ORDER by diem desc";
                    where = "";
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
                hql = "SELECT r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name, "
                            + "SUM(case when r.type=1 then 1 else 0 end), "
                            + "SUM(case when r.type=0 then 1 else 0 end), "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + " GROUP BY r.staff.id, r.staff.name, r.staff.photo, r.staff.depart.name "
                            + "ORDER by diem desc";
		Query query = session.createQuery(hql);
                List<Object[]> list = query.list();
                model.addAttribute("liststaff", list);
                model.addAttribute("startdate", startDate);
                model.addAttribute("enddate", endDate);
		return "admin/general/staff";
	}
        @RequestMapping("/searchdepart")
	public String searchDepart(ModelMap model, @RequestParam("startdate") String startDate, 
                @RequestParam("enddate") String endDate, @RequestParam("depart_id") String depart_id) {
		Session session = factory.getCurrentSession();
                String hql = "";
                String where = "";
                    if(depart_id.equals("All")){
                        if(startDate.equals("") && endDate.equals("")){
                        where = " ";
                    }else if(endDate.equals("")){
                        where = "where r.date >= '"+startDate+"' "    ;
                    }else if(startDate.equals("")){
                        where = "where r.date <= '"+endDate+"' "  ;
                    }else{
                        where = "where date BETWEEN '"+startDate+"' and '"+endDate+"' " ;
                    }
                    }else{
                        if(startDate.equals("") && endDate.equals("")){
                        where = "where r.staff.depart.id = '"+depart_id+"' ";
                    }else if(endDate.equals("")){
                        where = "where r.date >= '"+startDate+"' and r.staff.depart.id = '"+depart_id+"' "   ;
                    }else if(startDate.equals("")){
                        where = "where r.date <= '"+endDate+"' and r.staff.depart.id = '"+depart_id+"' ";
                    }else{
                        where = "where date BETWEEN '"+startDate+"' and '"+endDate+"' and r.staff.depart.id = '"+depart_id+"' ";
                    }
                    }
                hql = "SELECT r.staff.depart.name, "
                            + "SUM(case when r.type=1 then 1 else 0 end), "
                            + "SUM(case when r.type=0 then 1 else 0 end), "
                            + "((SUM(case when r.type=1 then 1 else 0 end))-(SUM(case when r.type=0 then 1 else 0 end))) as diem "
                            + "FROM Record r "
                            + where
                            + " GROUP BY r.staff.depart.name "
                            + "ORDER by diem desc";
		Query query = session.createQuery(hql);
                List<Object[]> list = query.list();
                model.addAttribute("listdepart", list);
                model.addAttribute("startdate", startDate);
                model.addAttribute("enddate", endDate);
		return "admin/general/depart";
	}
    
}
