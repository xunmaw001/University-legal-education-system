package com.entity.view;

import com.entity.DiscusslvshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 律师评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
@TableName("discusslvshi")
public class DiscusslvshiView  extends DiscusslvshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvshiView(){
	}
 
 	public DiscusslvshiView(DiscusslvshiEntity discusslvshiEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
