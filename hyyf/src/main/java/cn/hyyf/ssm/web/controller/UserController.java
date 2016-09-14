package cn.hyyf.ssm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hyyf.ssm.domain.User;
import cn.hyyf.ssm.service.UserService;


@Controller  
@RequestMapping("/user")  
public class UserController {  
   @Autowired 
   private UserService userService;  
     
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){  
//       int userId = Integer.parseInt(request.getParameter("id"));  
	   int userId = 1;
       User user = this.userService.getUserById(userId);  
       model.addAttribute("user", user);  
       return "index";  
   }
}  
