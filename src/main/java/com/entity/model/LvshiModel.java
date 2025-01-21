package com.entity.model;

import com.entity.LvshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 律师
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-18 19:49:37
 */
public class LvshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 律师姓名
	 */
	
	private String lvshixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 联系邮箱
	 */
	
	private String lianxiyouxiang;
		
	/**
	 * 律师等级
	 */
	
	private String lvshidengji;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：律师姓名
	 */
	 
	public void setLvshixingming(String lvshixingming) {
		this.lvshixingming = lvshixingming;
	}
	
	/**
	 * 获取：律师姓名
	 */
	public String getLvshixingming() {
		return lvshixingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：联系邮箱
	 */
	 
	public void setLianxiyouxiang(String lianxiyouxiang) {
		this.lianxiyouxiang = lianxiyouxiang;
	}
	
	/**
	 * 获取：联系邮箱
	 */
	public String getLianxiyouxiang() {
		return lianxiyouxiang;
	}
				
	
	/**
	 * 设置：律师等级
	 */
	 
	public void setLvshidengji(String lvshidengji) {
		this.lvshidengji = lvshidengji;
	}
	
	/**
	 * 获取：律师等级
	 */
	public String getLvshidengji() {
		return lvshidengji;
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
			
}
