package com.single_a_project.sapapp.domain;

public class MemberVO {
	private int m_idx;				// MGL_USER_IDX int;
	private String m_id;				// MGL_USER_ID	varchar(16)			
	private String m_pw;				//MGL_USER_PW VARCHAR(16)
	private String m_nm;				//MGL_USER_NM VARCHAR(12)
	private String m_sex;				//MGL_USER_SEX VARCHAR(1)
	private String m_tsize;			//MGL_USER_TSIZE VARCHAR(3)
	private String m_birth;			//MGL_USER_BIRTH VARCHAR(8)
	private String m_tel;				//MGL_USER_TEL VARCHAR(11)
	private String m_email;			//MGL_USER_EMAIL VARCHAR(16)
	private String m_loginDate;		//MGL_USER_LOGINDATE	timestamp
	private String m_dropDate;		//MGL_USER_DROPDATE	timestamp
	private String m_joinDate;		//MGL_USER_JOINDATE	timestamp
	
	private String uc_idx;				//MGL_UCLUB_IDX
	private String c_idx;				//MGL_CLUB_IDX
	private String uc_grade_cd;		//MGL_UCLUB_GRADE_CD
	private String uc_mng;			//MGL_UCLUB_MNG
	private String uc_regidate;		//MGL_UCLUB_REGIDATE
	
	private int age;							//회원 나이를 얻기 위한 변수
	private String ageGroup;				//회원의 나이대를 얻기 위한 변수
	private String gameStatus;
	
	public String getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	public int getM_idx() {
		return m_idx;
	}
	public void setM_idx(int m_idx) {
		this.m_idx = m_idx;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_nm() {
		return m_nm;
	}
	public void setM_nm(String m_nm) {
		this.m_nm = m_nm;
	}
	public String getM_sex() {
		return m_sex;
	}
	public void setM_sex(String m_sex) {
		this.m_sex = m_sex;
	}
	public String getM_tsize() {
		return m_tsize;
	}
	public void setM_tsize(String m_tsize) {
		this.m_tsize = m_tsize;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}
	public String getM_tel() {
		return m_tel;
	}
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_loginDate() {
		return m_loginDate;
	}
	public void setM_loginDate(String m_loginDate) {
		this.m_loginDate = m_loginDate;
	}
	public String getM_dropDate() {
		return m_dropDate;
	}
	public void setM_dropDate(String m_dropDate) {
		this.m_dropDate = m_dropDate;
	}
	public String getM_joinDate() {
		return m_joinDate;
	}
	public void setM_joinDate(String m_joinDate) {
		this.m_joinDate = m_joinDate;
	}
	public String getUc_idx() {
		return uc_idx;
	}
	public void setUc_idx(String uc_idx) {
		this.uc_idx = uc_idx;
	}
	public String getC_idx() {
		return c_idx;
	}
	public void setC_idx(String c_idx) {
		this.c_idx = c_idx;
	}
	public String getUc_grade_cd() {
		return uc_grade_cd;
	}
	public void setUc_grade_cd(String uc_grade_cd) {
		this.uc_grade_cd = uc_grade_cd;
	}
	public String getUc_mng() {
		return uc_mng;
	}
	public void setUc_mng(String uc_mng) {
		this.uc_mng = uc_mng;
	}
	public String getUc_regidate() {
		return uc_regidate;
	}
	public void setUc_regidate(String uc_regidate) {
		this.uc_regidate = uc_regidate;
	}
}

