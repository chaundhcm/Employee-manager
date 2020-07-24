package controller;

import components.Mailer2;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.ServletContext;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/mailer2/")
public class Mailer2Controller {
	@Autowired
	Mailer2 mailer;
	
	@RequestMapping("form")
	public String index() {
		return "mailer/form2";
	}
    
	@Autowired
	ServletContext context;
	
	@RequestMapping("send")
	public String send2(ModelMap model, 
			@RequestParam("from") String from,
			@RequestParam("to") String to,
                        @RequestParam("cc") String cc,
                        @RequestParam("bcc") String bcc,
			@RequestParam("subject") String subject,
			@RequestParam("body") String body) {
		try {
                    mailer.send(from, to, cc, bcc, subject, body);
                    model.addAttribute("message", "Gửi email thành công !");
                } catch (Exception e) {
                    model.addAttribute("message", "Gửi email thất bại !");
                }
                return "mailer/form2";
	}

}
