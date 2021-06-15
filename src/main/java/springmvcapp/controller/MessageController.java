package springmvcapp.controller;
import springmvcapp.model.Message;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

@GetMapping("/")
 public String homePage() {
	 return "index";
 }


// http://localhost:8090/SpringMVCDEMO/message
@GetMapping("/message")
public String messgeHandler(Model model) {
	 Message msg=new Message();
	 msg.setId(102);
	 msg.setContent("Welcome to Web World !");
	 msg.setCreatedDate(LocalDate.now().toString());
	 
	 model.addAttribute("message",msg);
	 
	 return "messageView";
}
 
@GetMapping("/twitter")
public String twitterMessage(Model model) {
	
	 Message msg=new Message();
	 msg.setId(102);
	 msg.setContent("Twitter messages");
	 msg.setCreatedDate(LocalDate.now().toString());
	 
	 model.addAttribute("tm",msg);
	 
	 return "twitterView";
	
	
}



 
}
