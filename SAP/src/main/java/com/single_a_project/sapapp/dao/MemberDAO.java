package com.single_a_project.sapapp.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.single_a_project.sapapp.dto.LoginDTO;

public class MemberDAO {
	
	@Autowired
	public SqlSessionTemplate sqlSession;

	public int getLogin(LoginDTO dto) {
		return sqlSession.selectOne("sap.Member.getLogin", dto);
	}

}
