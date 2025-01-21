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


import com.dao.DiscussfalvzhishiDao;
import com.entity.DiscussfalvzhishiEntity;
import com.service.DiscussfalvzhishiService;
import com.entity.vo.DiscussfalvzhishiVO;
import com.entity.view.DiscussfalvzhishiView;

@Service("discussfalvzhishiService")
public class DiscussfalvzhishiServiceImpl extends ServiceImpl<DiscussfalvzhishiDao, DiscussfalvzhishiEntity> implements DiscussfalvzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfalvzhishiEntity> page = this.selectPage(
                new Query<DiscussfalvzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussfalvzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfalvzhishiEntity> wrapper) {
		  Page<DiscussfalvzhishiView> page =new Query<DiscussfalvzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfalvzhishiVO> selectListVO(Wrapper<DiscussfalvzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfalvzhishiVO selectVO(Wrapper<DiscussfalvzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfalvzhishiView> selectListView(Wrapper<DiscussfalvzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfalvzhishiView selectView(Wrapper<DiscussfalvzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
