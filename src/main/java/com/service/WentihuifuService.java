package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentihuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentihuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentihuifuView;


/**
 * 问题回复
 *
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
public interface WentihuifuService extends IService<WentihuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentihuifuVO> selectListVO(Wrapper<WentihuifuEntity> wrapper);
   	
   	WentihuifuVO selectVO(@Param("ew") Wrapper<WentihuifuEntity> wrapper);
   	
   	List<WentihuifuView> selectListView(Wrapper<WentihuifuEntity> wrapper);
   	
   	WentihuifuView selectView(@Param("ew") Wrapper<WentihuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentihuifuEntity> wrapper);
   	

}

