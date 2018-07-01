package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.spring5.view.ThymeleafView;


@RestController
public class Controller {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@RequestMapping(value="/mypage")
	public ModelAndView getPage(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		view.setViewName("helloworld");
	  return view;	
	}

	@RequestMapping(value="/imageviewer")
	public ThymeleafView getImageViewer(HttpServletRequest request) {
		ThymeleafView view = new ThymeleafView("imageviewer");
		 applicationContext.getAutowireCapableBeanFactory().initializeBean(view, "imageviewer");
//	view.addStaticVariable("message", "This is string from servlet");
	  return view;	
	}	

	
	@RequestMapping(value="/testpage")
	public String getTestPage() {
	  return "helloworld";	
	}		
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpServletRequest request) {
		String result = "<div class=\"container\">\n" + 
				"  <img alt=\"MyPhoto\" src=\"files/123cheese01.jpg\">\n" +
				" <button class=\"btn\">Button</button>"+
				"  </div>"+
				".container {\n" + 
				"  position: relative;\n" + 
				"  width: 50%;\n" + 
				"}\n" + 
				"\n" + 
				"/* Make the image responsive */\n" + 
				".container img {\n" + 
				"  width: 100%;\n" + 
				"  height: auto;\n" + 
				"}\n" + 
				"\n" + 
				"/* Style the button and place it in the middle of the container/image */\n" + 
				".container .btn {\n" + 
				"  position: absolute;\n" + 
				"  top: 50%;\n" + 
				"  left: 50%;\n" + 
				"  transform: translate(-50%, -50%);\n" + 
				"  -ms-transform: translate(-50%, -50%);\n" + 
				"  background-color: #555;\n" + 
				"  color: white;\n" + 
				"  font-size: 16px;\n" + 
				"  padding: 12px 24px;\n" + 
				"  border: none;\n" + 
				"  cursor: pointer;\n" + 
				"  border-radius: 5px;\n" + 
				"}\n" + 
				"\n" + 
				".container .btn:hover {\n" + 
				"  background-color: black;\n" + 
				"}";		
		return result;
	}
	
	@RequestMapping("/hello")
	public String get(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		if (name == null) 
			name  = "world!";
		return "Hello "+name;
	}

}
