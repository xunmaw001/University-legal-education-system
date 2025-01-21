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


import com.dao.LvshituijianDao;
import com.entity.LvshituijianEntity;
import com.service.LvshituijianService;
import com.entity.vo.LvshituijianVO;
import com.entity.view.LvshituijianView;

@Service("lvshituijianService")
public class LvshituijianServiceImpl extends ServiceImpl<LvshituijianDao, LvshituijianEntity> implements LvshituijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvshituijianEntity> page = this.selectPage(
                new Query<LvshituijianEntity>(params).getPage(),
                new EntityWrapper<LvshituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvshituijianEntity> wrapper) {
		  Page<LvshituijianView> page =new Query<LvshituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvshituijianVO> selectListVO(Wrapper<LvshituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvshituijianVO selectVO(Wrapper<LvshituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvshituijianView> selectListView(Wrapper<LvshituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvshituijianView selectView(Wrapper<LvshituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
