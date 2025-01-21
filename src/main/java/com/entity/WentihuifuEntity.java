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
 * 问题回复
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
@TableName("wentihuifu")
public class WentihuifuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WentihuifuEntity() {
		
	}
	
	public WentihuifuEntity(T t) {
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
	 * 学生
	 */
					
	private String xuesheng;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 回复内容
	 */
					
	private String huifuneirong;
	
	/**
	 * 回复时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huifushijian;
	
	/**
	 * 律师账号
	 */
					
	private String lvshizhanghao;
	
	/**
	 * 律师姓名
	 */
					
	private String lvshixingming;
	
	
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
	 * 设置：学生
	 */
	public void setXuesheng(String xuesheng) {
		this.xuesheng = xuesheng;
	}
	/**
	 * 获取：学生
	 */
	public String getXuesheng() {
		return xuesheng;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：回复内容
	 */
	public void setHuifuneirong(String huifuneirong) {
		this.huifuneirong = huifuneirong;
	}
	/**
	 * 获取：回复内容
	 */
	public String getHuifuneirong() {
		return huifuneirong;
	}
	/**
	 * 设置：回复时间
	 */
	public void setHuifushijian(Date huifushijian) {
		this.huifushijian = huifushijian;
	}
	/**
	 * 获取：回复时间
	 */
	public Date getHuifushijian() {
		return huifushijian;
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

}
