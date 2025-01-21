package com.entity.model;

import com.entity.FalvxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 法律新闻
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public class FalvxinwenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章来源
	 */
	
	private String wenzhanglaiyuan;
		
	/**
	 * 新闻类型
	 */
	
	private String xinwenleixing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 新闻内容
	 */
	
	private String xinwenneirong;
		
	/**
	 * 新闻图片
	 */
	
	private String xinwentupian;
		
	/**
	 * 发布人
	 */
	
	private String faburen;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：文章来源
	 */
	 
	public void setWenzhanglaiyuan(String wenzhanglaiyuan) {
		this.wenzhanglaiyuan = wenzhanglaiyuan;
	}
	
	/**
	 * 获取：文章来源
	 */
	public String getWenzhanglaiyuan() {
		return wenzhanglaiyuan;
	}
				
	
	/**
	 * 设置：新闻类型
	 */
	 
	public void setXinwenleixing(String xinwenleixing) {
		this.xinwenleixing = xinwenleixing;
	}
	
	/**
	 * 获取：新闻类型
	 */
	public String getXinwenleixing() {
		return xinwenleixing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：新闻内容
	 */
	 
	public void setXinwenneirong(String xinwenneirong) {
		this.xinwenneirong = xinwenneirong;
	}
	
	/**
	 * 获取：新闻内容
	 */
	public String getXinwenneirong() {
		return xinwenneirong;
	}
				
	
	/**
	 * 设置：新闻图片
	 */
	 
	public void setXinwentupian(String xinwentupian) {
		this.xinwentupian = xinwentupian;
	}
	
	/**
	 * 获取：新闻图片
	 */
	public String getXinwentupian() {
		return xinwentupian;
	}
				
	
	/**
	 * 设置：发布人
	 */
	 
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
