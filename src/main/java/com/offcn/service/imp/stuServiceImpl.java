package com.offcn.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.stuDao;
import com.offcn.po.NewStudent;
import com.offcn.service.stuService;
@Service
public class stuServiceImpl implements stuService {

	@Autowired
	stuDao dao;
	@Override
	public List<NewStudent> getAll() {
		return dao.getAll();
	}

}
