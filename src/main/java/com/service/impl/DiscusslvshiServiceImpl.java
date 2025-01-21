package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusslvshiDao;
import com.entity.DiscusslvshiEntity;
import com.service.DiscusslvshiService;
import com.entity.vo.DiscusslvshiVO;
import com.entity.view.DiscusslvshiView;

@Service("discusslvshiService")
public class DiscusslvshiServiceImpl extends ServiceImpl<DiscusslvshiDao, DiscusslvshiEntity> implements DiscusslvshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvshiEntity> page = this.selectPage(
                new Query<DiscusslvshiEntity>(params).getPage(),
                new EntityWrapper<DiscusslvshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvshiEntity> wrapper) {
		  Page<DiscusslvshiView> page =new Query<DiscusslvshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvshiVO> selectListVO(Wrapper<DiscusslvshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvshiVO selectVO(Wrapper<DiscusslvshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvshiView> selectListView(Wrapper<DiscusslvshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvshiView selectView(Wrapper<DiscusslvshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
