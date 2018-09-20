package com.baiyue.vo;

import java.io.Serializable;
import java.util.List;

public class FunctionPageList implements Serializable{
	private static final long serialVersionUID = 1L;

	private int pageId;
	private String pageName;
	private String pagePath;
	/**
	 * 是否有这个权利（当前）
	 */
	private int isEnable;
	
	private List<FunctionPageList> subList;
	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getPagePath() {
		return pagePath;
	}
	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}
	public List<FunctionPageList> getSubList() {
		return subList;
	}
	public void setSubList(List<FunctionPageList> subList) {
		this.subList = subList;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	
	
}
