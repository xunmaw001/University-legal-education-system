package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvshituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvshituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvshituijianView;


/**
 * 律师推荐
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface LvshituijianService extends IService<LvshituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvshituijianVO> selectListVO(Wrapper<LvshituijianEntity> wrapper);
   	
   	LvshituijianVO selectVO(@Param("ew") Wrapper<LvshituijianEntity> wrapper);
   	
   	List<LvshituijianView> selectListView(Wrapper<LvshituijianEntity> wrapper);
   	
   	LvshituijianView selectView(@Param("ew") Wrapper<LvshituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvshituijianEntity> wrapper);
   	

}

