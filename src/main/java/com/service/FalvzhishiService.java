package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FalvzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FalvzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FalvzhishiView;


/**
 * 法律知识
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface FalvzhishiService extends IService<FalvzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FalvzhishiVO> selectListVO(Wrapper<FalvzhishiEntity> wrapper);
   	
   	FalvzhishiVO selectVO(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
   	
   	List<FalvzhishiView> selectListView(Wrapper<FalvzhishiEntity> wrapper);
   	
   	FalvzhishiView selectView(@Param("ew") Wrapper<FalvzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FalvzhishiEntity> wrapper);
   	

}

