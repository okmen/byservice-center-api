package com.baiyue.entity;

import java.io.Serializable;
import java.util.Date;

public class Banner implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    //图片地址
    private String imgUrl;

    //广告名称
    private String adName;

    //轮播时间（秒）
    private Integer sliderTime;

    //创建时间
    private Date createTime;

    //创建人
    private Integer createUserId;

    //修改时间
    private Date updateTime;

    //修改人
    private Integer updateUserId;

    //发布时间
    private Date publishTime;

    //状态：1 已发布 ，2 已下架
    private Integer status;
    private String statusValue;

    //跳转链接
    private String url;

    //图片序号
    private Integer num;

    //是否删除 0未删除 1已删除
    private Integer isDelete;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取图片地址
     *
     * @return img_url - 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取广告名称
     *
     * @return ad_name - 广告名称
     */
    public String getAdName() {
        return adName;
    }

    /**
     * 设置广告名称
     *
     * @param adName 广告名称
     */
    public void setAdName(String adName) {
        this.adName = adName;
    }

    /**
     * 获取轮播时间（秒）
     *
     * @return slider_time - 轮播时间（秒）
     */
    public Integer getSliderTime() {
        return sliderTime;
    }

    /**
     * 设置轮播时间（秒）
     *
     * @param sliderTime 轮播时间（秒）
     */
    public void setSliderTime(Integer sliderTime) {
        this.sliderTime = sliderTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取修改人
     *
     * @return update_user_id - 修改人
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置修改人
     *
     * @param updateUserId 修改人
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取发布时间
     *
     * @return publish_time - 发布时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置发布时间
     *
     * @param publishTime 发布时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获取状态：1 已发布 ，2 已下架
     *
     * @return status - 状态：1 已发布 ，2 已下架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：1 已发布 ，2 已下架
     *
     * @param status 状态：1 已发布 ，2 已下架
     */
    public void setStatus(Integer status) {
        this.status = status;
        if(status==1000){
        	this.statusValue="待发布";
        }else if(status==1001){
        	this.statusValue="已发布";
        }else if(status==1002){
        	this.statusValue="已下架";
        }
    }

    /**
     * 获取跳转链接
     *
     * @return url - 跳转链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置跳转链接
     *
     * @param url 跳转链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图片序号
     *
     * @return num - 图片序号
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置图片序号
     *
     * @param num 图片序号
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取是否删除 0未删除 1已删除
     *
     * @return is_delete - 是否删除 0未删除 1已删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0未删除 1已删除
     *
     * @param isDelete 是否删除 0未删除 1已删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    
	public String getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	@Override
	public String toString() {
		return "Banner [id=" + id + ", imgUrl=" + imgUrl + ", adName=" + adName + ", sliderTime=" + sliderTime
				+ ", createTime=" + createTime + ", createUserId=" + createUserId + ", updateTime=" + updateTime
				+ ", updateUserId=" + updateUserId + ", publishTime=" + publishTime + ", status=" + status + ", url="
				+ url + ", num=" + num + ", isDelete=" + isDelete + "]";
	}
    
}