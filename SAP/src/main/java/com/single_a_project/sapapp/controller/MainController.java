package com.single_a_project.sapapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/main.sap")
	public String main() {		
		return "main";
	}
}
