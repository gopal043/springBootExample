package com.springboot.springbootthymeleafviewexample;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	public DemoController() {
		super();
		System.out.println("DemoController Contructor");
	}

	@RequestMapping("/")
	public String index(HttpServletResponse response) {
		System.out.println("index() ");
		response.setHeader("Content-Type","text/html");
		return "index";
	}
	
	/*@RequestMapping("/")
	public ModelAndView index () {
		System.out.println("index() ");
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}*/

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		System.out.println("save() "+user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}