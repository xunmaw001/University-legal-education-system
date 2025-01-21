package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FalvxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FalvxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FalvxinwenView;


/**
 * 法律新闻
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface FalvxinwenService extends IService<FalvxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FalvxinwenVO> selectListVO(Wrapper<FalvxinwenEntity> wrapper);
   	
   	FalvxinwenVO selectVO(@Param("ew") Wrapper<FalvxinwenEntity> wrapper);
   	
   	List<FalvxinwenView> selectListView(Wrapper<FalvxinwenEntity> wrapper);
   	
   	FalvxinwenView selectView(@Param("ew") Wrapper<FalvxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FalvxinwenEntity> wrapper);
   	

}

