package com.entity.view;

import com.entity.DiscussfalvzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 法律知识评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
@TableName("discussfalvzhishi")
public class DiscussfalvzhishiView  extends DiscussfalvzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfalvzhishiView(){
	}
 
 	public DiscussfalvzhishiView(DiscussfalvzhishiEntity discussfalvzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfalvzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
