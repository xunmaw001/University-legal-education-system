package com.dao;

import com.entity.LvshituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvshituijianVO;
import com.entity.view.LvshituijianView;


/**
 * 律师推荐
 * 
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface LvshituijianDao extends BaseMapper<LvshituijianEntity> {
	
	List<LvshituijianVO> selectListVO(@Param("ew") Wrapper<LvshituijianEntity> wrapper);
	
	LvshituijianVO selectVO(@Param("ew") Wrapper<LvshituijianEntity> wrapper);
	
	List<LvshituijianView> selectListView(@Param("ew") Wrapper<LvshituijianEntity> wrapper);

	List<LvshituijianView> selectListView(Pagination page,@Param("ew") Wrapper<LvshituijianEntity> wrapper);
	
	LvshituijianView selectView(@Param("ew") Wrapper<LvshituijianEntity> wrapper);
	

}
