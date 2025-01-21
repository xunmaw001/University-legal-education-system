package com.dao;

import com.entity.WentihuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentihuifuVO;
import com.entity.view.WentihuifuView;


/**
 * 问题回复
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface WentihuifuDao extends BaseMapper<WentihuifuEntity> {
	
	List<WentihuifuVO> selectListVO(@Param("ew") Wrapper<WentihuifuEntity> wrapper);
	
	WentihuifuVO selectVO(@Param("ew") Wrapper<WentihuifuEntity> wrapper);
	
	List<WentihuifuView> selectListView(@Param("ew") Wrapper<WentihuifuEntity> wrapper);

	List<WentihuifuView> selectListView(Pagination page,@Param("ew") Wrapper<WentihuifuEntity> wrapper);
	
	WentihuifuView selectView(@Param("ew") Wrapper<WentihuifuEntity> wrapper);
	

}
