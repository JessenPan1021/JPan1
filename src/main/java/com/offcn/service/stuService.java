package com.offcn.service;

import java.util.List;

import com.offcn.po.NewStudent;

public interface stuService {
	/**
	 *返回全部学生信息
	 */
	public List<NewStudent> getAll();
}
