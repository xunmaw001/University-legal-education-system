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


import com.dao.WentihuifuDao;
import com.entity.WentihuifuEntity;
import com.service.WentihuifuService;
import com.entity.vo.WentihuifuVO;
import com.entity.view.WentihuifuView;

@Service("wentihuifuService")
public class WentihuifuServiceImpl extends ServiceImpl<WentihuifuDao, WentihuifuEntity> implements WentihuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentihuifuEntity> page = this.selectPage(
                new Query<WentihuifuEntity>(params).getPage(),
                new EntityWrapper<WentihuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentihuifuEntity> wrapper) {
		  Page<WentihuifuView> page =new Query<WentihuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentihuifuVO> selectListVO(Wrapper<WentihuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentihuifuVO selectVO(Wrapper<WentihuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentihuifuView> selectListView(Wrapper<WentihuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentihuifuView selectView(Wrapper<WentihuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
