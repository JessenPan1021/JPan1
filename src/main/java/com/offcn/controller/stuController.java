package com.offcn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.po.NewStudent;
import com.offcn.po.pieData;
import com.offcn.service.stuService;

@Controller
public class stuController {

	@Autowired
	stuService service;
	/**
	 * 为柱状图、折线图提供数据的方法
	 */
	@RequestMapping("/getall")
	@ResponseBody
	public List<NewStudent> getallbarline(){
		return service.getAll();
	}
	
	/**
	 * 为饼状图提供数据的方法
	 */
	@RequestMapping("/getallpie")
	@ResponseBody
	public List<pieData> getallpie(){
		List<NewStudent> list = service.getAll();
		List<pieData> listp=new ArrayList<pieData>();
		for (NewStudent stu : list) {
			pieData p = new pieData();
			p.setName(stu.getName());
			p.setValue(stu.getScore());
			listp.add(p);
		}
		return listp;
	}
}
