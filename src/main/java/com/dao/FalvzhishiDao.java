package com.dao;

import com.entity.FalvzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FalvzhishiVO;
import com.entity.view.FalvzhishiView;


/**
 * 法律知识
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface FalvzhishiDao extends BaseMapper<FalvzhishiEntity> {
	
	List<FalvzhishiVO> selectListVO(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
	
	FalvzhishiVO selectVO(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
	
	List<FalvzhishiView> selectListView(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);

	List<FalvzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
	
	FalvzhishiView selectView(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
	

}
