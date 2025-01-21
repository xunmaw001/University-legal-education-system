package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 律师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-18 19:49:37
 */
@TableName("lvshi")
public class LvshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvshiEntity() {
		
	}
	
	public LvshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 律师账号
	 */
					
	private String lvshizhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：律师账号
	 */
	public void setLvshizhanghao(String lvshizhanghao) {
		this.lvshizhanghao = lvshizhanghao;
	}
	/**
	 * 获取：律师账号
	 */
	public String getLvshizhanghao() {
		return lvshizhanghao;
	}
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
