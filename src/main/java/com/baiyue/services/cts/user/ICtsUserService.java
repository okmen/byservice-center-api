package com.baiyue.services.cts.user;

import com.utils_max.ResultMsg;

public interface ICtsUserService {
	/**
	 * cts用户登陆（手机号/用户名登陆）
	 * @author max
	 * @date:   2018年9月19日
	 * @Desc :
	 * @param usernameOrPhone
	 * @param pwd
	 * @return
	 */
	public ResultMsg login(String usernameOrPhone,String pwd);
}
