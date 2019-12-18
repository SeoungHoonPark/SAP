package com.single_a_project.sapapp.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.single_a_project.sapapp.dao.MemberDAO;
import com.single_a_project.sapapp.dto.LoginDTO;

public class MemberService {
	
	@Autowired
	MemberDAO mDAO;
	
	public int getLogin(LoginDTO dto) {
		return mDAO.getLogin(dto);
	}
	
	public boolean getSessionSetting(int cnt, HttpSession session, LoginDTO dto){
		boolean isLogin = false;
		if(cnt == 0){
		}else{
			session.setMaxInactiveInterval(3600);
			session.setAttribute("UID", dto.getM_id());
			isLogin = true;
		}
		return isLogin;
	}
	
	
}
