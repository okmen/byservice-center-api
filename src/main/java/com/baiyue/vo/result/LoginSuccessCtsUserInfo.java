package com.baiyue.vo.result;

import java.io.Serializable;

public class LoginSuccessCtsUserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String realname;
	private String phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
