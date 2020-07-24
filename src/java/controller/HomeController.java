/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import components.Mailer2;
import entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PC
 */
@Transactional
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    SessionFactory factory;
    
    @Autowired
    Mailer2 mailer;
    
    @RequestMapping("/index")
	public String index(ModelMap model, HttpSession httpSession) {
		return "home/login";
	}
    @RequestMapping(value="login", method=RequestMethod.POST)
	public String login(ModelMap model, 
			@RequestParam("id") String id,
			@RequestParam("password") String password,
			HttpSession httpSession) {
                Session session = factory.getCurrentSession();
                try{
                User user = (User) session.get(User.class, id);
                    if(id.equals(user.getUsername()) && password.equals(user.getPassword())){
                        httpSession.setAttribute("iduser", id);
                        httpSession.setAttribute("nameuser", user.getFullname());
                        if(user.getRole()==true){
                            
                                return "redirect:/admin/user/top10.htm";
                        }else{
                            
                                return "redirect:/user/index.htm";
                            }       
                    }
                    else{
                            model.addAttribute("message", "Sai mật khẩu !");
                           
                    }
                 }catch (Exception e) {
                      httpSession.removeAttribute("iduser");
                            httpSession.removeAttribute("nameuser");
			model.addAttribute("message", "Sai tài khoản thất bại !");
		}
		return "home/login";
	}
    @RequestMapping("/rspass")
	public String resetPass(ModelMap model) {
		return "home/reset-pass";
	}
    @RequestMapping("/register")
	public String register(ModelMap model) {
		return "home/reset-pass";
	}
    @RequestMapping("recover-password")
    public String send1(ModelMap model,
    @RequestParam("to") String to
    ) {
        String from = "chaundps09898@fpt.edu.vn";
        String subject = "ABC Group - Reset your password";
        Random random = new Random();
        int pass = random.nextInt(999999);
        String body = "Mật khẩu của bạn là: "+ pass ;
        String cc = "";
        String bcc = "";
        
    try{
    // Gửi mail
    mailer.send(from, to, cc, bcc, subject, body);
    model.addAttribute("message", "Gửi pass thành công !");
    update(pass, to);
    }
    catch(Exception ex){
    model.addAttribute("message", "Gửi pass thất bại !");
    }
    return "home/reset-pass";
    }
    public static void update(int pw, String us){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Java5_ASM";
            Connection con = DriverManager.getConnection(url, "sa", "songlong");
            String sql = "update Users set password=? where username=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, pw);
            stm.setString(2, us);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
