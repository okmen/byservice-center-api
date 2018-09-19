package com.baiyue.vo.result;

import java.io.Serializable;

public class LoginSuccessWebUserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String mobilePhone;

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
}
