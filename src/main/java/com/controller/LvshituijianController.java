package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LvshituijianEntity;
import com.entity.view.LvshituijianView;

import com.service.LvshituijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 律师推荐
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
@RestController
@RequestMapping("/lvshituijian")
public class LvshituijianController {
    @Autowired
    private LvshituijianService lvshituijianService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvshituijianEntity lvshituijian, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lvshi")) {
			lvshituijian.setLvshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LvshituijianEntity> ew = new EntityWrapper<LvshituijianEntity>();
		PageUtils page = lvshituijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvshituijian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvshituijianEntity lvshituijian, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lvshi")) {
			lvshituijian.setLvshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LvshituijianEntity> ew = new EntityWrapper<LvshituijianEntity>();
		PageUtils page = lvshituijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvshituijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvshituijianEntity lvshituijian){
       	EntityWrapper<LvshituijianEntity> ew = new EntityWrapper<LvshituijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvshituijian, "lvshituijian")); 
        return R.ok().put("data", lvshituijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvshituijianEntity lvshituijian){
        EntityWrapper< LvshituijianEntity> ew = new EntityWrapper< LvshituijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvshituijian, "lvshituijian")); 
		LvshituijianView lvshituijianView =  lvshituijianService.selectView(ew);
		return R.ok("查询律师推荐成功").put("data", lvshituijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvshituijianEntity lvshituijian = lvshituijianService.selectById(id);
        return R.ok().put("data", lvshituijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvshituijianEntity lvshituijian = lvshituijianService.selectById(id);
        return R.ok().put("data", lvshituijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvshituijianEntity lvshituijian, HttpServletRequest request){
    	lvshituijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvshituijian);

        lvshituijianService.insert(lvshituijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvshituijianEntity lvshituijian, HttpServletRequest request){
    	lvshituijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvshituijian);
    	lvshituijian.setUserid((Long)request.getSession().getAttribute("userId"));

        lvshituijianService.insert(lvshituijian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LvshituijianEntity lvshituijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvshituijian);
        lvshituijianService.updateById(lvshituijian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvshituijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LvshituijianEntity> wrapper = new EntityWrapper<LvshituijianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lvshi")) {
			wrapper.eq("lvshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lvshituijianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
