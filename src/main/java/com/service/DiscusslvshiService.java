package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvshiView;


/**
 * 律师评论表
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface DiscusslvshiService extends IService<DiscusslvshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvshiVO> selectListVO(Wrapper<DiscusslvshiEntity> wrapper);
   	
   	DiscusslvshiVO selectVO(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
   	
   	List<DiscusslvshiView> selectListView(Wrapper<DiscusslvshiEntity> wrapper);
   	
   	DiscusslvshiView selectView(@Param("ew") Wrapper<DiscusslvshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvshiEntity> wrapper);
   	

}

