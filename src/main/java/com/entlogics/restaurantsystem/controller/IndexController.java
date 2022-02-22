package com.entlogics.restaurantsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.restaurantsystem.dao.IIndexDAO;

//index controller to show mvc flow
@Controller
public class IndexController {
	
	//using field injection
	@Autowired
	private IIndexDAO theDAO;
	
	//to show flow in controller
	@RequestMapping("/")
	public String showPage() {
		
		System.out.println("Inside Index Controller of showPage():::");
		
		return "index";
	}
	
	
	//call dao method
	@RequestMapping("/invokeDAO")
	public String home() {
		
		//log to the console
		System.out.println(theDAO.testFlow());
		
		return "view";		
	}

}
