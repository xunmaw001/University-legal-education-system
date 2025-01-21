package com.dao;

import com.entity.DiscusslvshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvshiVO;
import com.entity.view.DiscusslvshiView;


/**
 * 律师评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface DiscusslvshiDao extends BaseMapper<DiscusslvshiEntity> {
	
	List<DiscusslvshiVO> selectListVO(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
	
	DiscusslvshiVO selectVO(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
	
	List<DiscusslvshiView> selectListView(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);

	List<DiscusslvshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
	
	DiscusslvshiView selectView(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
	

}
