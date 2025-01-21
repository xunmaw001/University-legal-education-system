package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfalvzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfalvzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfalvzhishiView;


/**
 * 法律知识评论表
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface DiscussfalvzhishiService extends IService<DiscussfalvzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfalvzhishiVO> selectListVO(Wrapper<DiscussfalvzhishiEntity> wrapper);
   	
   	DiscussfalvzhishiVO selectVO(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
   	
   	List<DiscussfalvzhishiView> selectListView(Wrapper<DiscussfalvzhishiEntity> wrapper);
   	
   	DiscussfalvzhishiView selectView(@Param("ew") Wrapper<DiscussfalvzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfalvzhishiEntity> wrapper);
   	

}

