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


import com.dao.FalvzhishiDao;
import com.entity.FalvzhishiEntity;
import com.service.FalvzhishiService;
import com.entity.vo.FalvzhishiVO;
import com.entity.view.FalvzhishiView;

@Service("falvzhishiService")
public class FalvzhishiServiceImpl extends ServiceImpl<FalvzhishiDao, FalvzhishiEntity> implements FalvzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FalvzhishiEntity> page = this.selectPage(
                new Query<FalvzhishiEntity>(params).getPage(),
                new EntityWrapper<FalvzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FalvzhishiEntity> wrapper) {
		  Page<FalvzhishiView> page =new Query<FalvzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FalvzhishiVO> selectListVO(Wrapper<FalvzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FalvzhishiVO selectVO(Wrapper<FalvzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FalvzhishiView> selectListView(Wrapper<FalvzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FalvzhishiView selectView(Wrapper<FalvzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
