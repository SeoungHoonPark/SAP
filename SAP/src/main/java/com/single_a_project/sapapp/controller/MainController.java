package com.single_a_project.sapapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.single_a_project.sapapp.dto.LoginDTO;
import com.single_a_project.sapapp.service.MemberService;

@Controller
public class MainController {
	
	@Autowired
	public MemberService mService;
	
	@RequestMapping("/main.sap")
	public String main() {		
		return "main";
	}
	
	@RequestMapping("/Member/LoginProc.sap")
	public ModelAndView loginProc(ModelAndView mv, HttpSession session, LoginDTO dto) {
		
		try {
			int cnt  = mService.getLogin(dto);
			boolean isLogin = mService.getSessionSetting(cnt, session, dto);
			mv.addObject("isLogin", isLogin);
			
		} catch (Exception e) {
		}
		mv.setViewName("member/loginProc");
		return mv;
	}
}
