package com.dao;

import com.entity.LvshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvshiVO;
import com.entity.view.LvshiView;


/**
 * 律师
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:37
 */
public interface LvshiDao extends BaseMapper<LvshiEntity> {
	
	List<LvshiVO> selectListVO(@Param("ew") Wrapper<LvshiEntity> wrapper);
	
	LvshiVO selectVO(@Param("ew") Wrapper<LvshiEntity> wrapper);
	
	List<LvshiView> selectListView(@Param("ew") Wrapper<LvshiEntity> wrapper);

	List<LvshiView> selectListView(Pagination page,@Param("ew") Wrapper<LvshiEntity> wrapper);
	
	LvshiView selectView(@Param("ew") Wrapper<LvshiEntity> wrapper);
	

}
