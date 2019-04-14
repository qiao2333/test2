package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.pojo.Book;
import com.service.bookService;

@Controller
@RequestMapping("/book")
public class bookController {
	

	@Resource(name="bookService")
	private bookService bookService;
	
	@RequestMapping(value="/queryById")
	public ModelAndView queryById(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		long bookno =Long.parseLong(request.getParameter("bookNo"));
		try {
			Book book = bookService.findById(bookno);
			mv.setViewName("index");
			mv.addObject("var",book);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return mv;
		
	}
	
}
