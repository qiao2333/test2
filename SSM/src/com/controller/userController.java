package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.pojo.User;
import com.service.userService;

@Controller
@RequestMapping("/user")
public class userController {
	

	@Resource(name="userService")
	private userService userService;
	
	@RequestMapping(value="/queryById")
	public ModelAndView queryById(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			User user = userService.findById(id);
			mv.setViewName("index");
			mv.addObject("var",user);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return mv;
		
	}
	

}
