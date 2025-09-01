package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.master.MasterDataBaseMapper;
import com.example.demo.model.SalaryModel;
import com.example.demo.service.MasterDataBaseService;

@Service
public class MasterDataBaseServiceImpl implements MasterDataBaseService {
	@Autowired
	MasterDataBaseMapper masterDataBaseMapper;
	
	public List<SalaryModel> getSalary() throws Exception{
		return masterDataBaseMapper.getSalary();
	}
}
