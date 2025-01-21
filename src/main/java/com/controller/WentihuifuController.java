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

import com.entity.WentihuifuEntity;
import com.entity.view.WentihuifuView;

import com.service.WentihuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 问题回复
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-18 19:49:38
 */
@RestController
@RequestMapping("/wentihuifu")
public class WentihuifuController {
    @Autowired
    private WentihuifuService wentihuifuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WentihuifuEntity wentihuifu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wentihuifu.setXuesheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("lvshi")) {
			wentihuifu.setLvshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WentihuifuEntity> ew = new EntityWrapper<WentihuifuEntity>();
		PageUtils page = wentihuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentihuifu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WentihuifuEntity wentihuifu, 
		HttpServletRequest request){
        EntityWrapper<WentihuifuEntity> ew = new EntityWrapper<WentihuifuEntity>();
		PageUtils page = wentihuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentihuifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WentihuifuEntity wentihuifu){
       	EntityWrapper<WentihuifuEntity> ew = new EntityWrapper<WentihuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wentihuifu, "wentihuifu")); 
        return R.ok().put("data", wentihuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WentihuifuEntity wentihuifu){
        EntityWrapper< WentihuifuEntity> ew = new EntityWrapper< WentihuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wentihuifu, "wentihuifu")); 
		WentihuifuView wentihuifuView =  wentihuifuService.selectView(ew);
		return R.ok("查询问题回复成功").put("data", wentihuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WentihuifuEntity wentihuifu = wentihuifuService.selectById(id);
        return R.ok().put("data", wentihuifu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WentihuifuEntity wentihuifu = wentihuifuService.selectById(id);
        return R.ok().put("data", wentihuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WentihuifuEntity wentihuifu, HttpServletRequest request){
    	wentihuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentihuifu);

        wentihuifuService.insert(wentihuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WentihuifuEntity wentihuifu, HttpServletRequest request){
    	wentihuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentihuifu);

        wentihuifuService.insert(wentihuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WentihuifuEntity wentihuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wentihuifu);
        wentihuifuService.updateById(wentihuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wentihuifuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WentihuifuEntity> wrapper = new EntityWrapper<WentihuifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuesheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("lvshi")) {
			wrapper.eq("lvshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wentihuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
