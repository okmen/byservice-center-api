package com.baiyue.services;


import com.baiyue.entity.Banner;


public interface IBannerService {
	/**
	 * 添加轮播图
	 * @param banner
	 * @return
	 * @throws Exception
	 */
	public int insert(Banner banner) throws Exception;
	/**
	 * 修改轮播图
	 * @param banner
	 * @return
	 * @throws Exception
	 */
	public int updateBanner(Banner banner) throws Exception;
	/**
	 * 删除轮播图
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteByPrimaryKey(Integer id) throws Exception;
	/**
	 * 根据id获取轮播图
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Banner selectByPrimaryKey(Integer id) throws Exception;
}
