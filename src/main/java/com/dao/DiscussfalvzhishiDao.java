package com.dao;

import com.entity.DiscussfalvzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfalvzhishiVO;
import com.entity.view.DiscussfalvzhishiView;


/**
 * 法律知识评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface DiscussfalvzhishiDao extends BaseMapper<DiscussfalvzhishiEntity> {
	
	List<DiscussfalvzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
	
	DiscussfalvzhishiVO selectVO(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
	
	List<DiscussfalvzhishiView> selectListView(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);

	List<DiscussfalvzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
	
	DiscussfalvzhishiView selectView(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
	

}
