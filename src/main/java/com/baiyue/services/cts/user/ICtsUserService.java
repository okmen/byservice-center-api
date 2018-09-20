package com.baiyue.services.cts.user;

import com.baiyue.entity.AdminRole;
import com.baiyue.entity.AdminUsers;
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
	/**
	 * 新增角色
	 * @author max
	 * @date:   2018年9月20日
	 * @Desc :
	 * @param param
	 * @param username
	 * @return
	 */
	public ResultMsg addRole(AdminRole param,String username);
	/**
	 * 新增cts用户
	 * @author max
	 * @date:   2018年9月20日
	 * @Desc :
	 * @param param  （ps password 参数需md5加密后传过来）
	 * @param username
	 * @return
	 */
	public ResultMsg addUser(AdminUsers param,String username);
}
