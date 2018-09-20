package com.baiyue.vo.result;

import java.io.Serializable;

public class LoginSuccessCtsUserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String realname;
	private String phone;
	
	private Integer roleId;
	private String roleName;
	private Object powerPageList;
	
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

	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Object getPowerPageList() {
		return powerPageList;
	}
	public void setPowerPageList(Object powerPageList) {
		this.powerPageList = powerPageList;
	}
	
	
	
}
