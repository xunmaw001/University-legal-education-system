package com.dao;

import com.entity.XinwenleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenleixingVO;
import com.entity.view.XinwenleixingView;


/**
 * 新闻类型
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface XinwenleixingDao extends BaseMapper<XinwenleixingEntity> {
	
	List<XinwenleixingVO> selectListVO(@Param("ew") Wrapper<XinwenleixingEntity> wrapper);
	
	XinwenleixingVO selectVO(@Param("ew") Wrapper<XinwenleixingEntity> wrapper);
	
	List<XinwenleixingView> selectListView(@Param("ew") Wrapper<XinwenleixingEntity> wrapper);

	List<XinwenleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenleixingEntity> wrapper);
	
	XinwenleixingView selectView(@Param("ew") Wrapper<XinwenleixingEntity> wrapper);
	

}
