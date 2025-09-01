package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.slave1.Slave1DataBaseMapper;
import com.example.demo.model.CountryModel;
import com.example.demo.service.Slave1DataBaseService;

@Service
public class Slave1DataBaseServiceImpl implements Slave1DataBaseService {
	@Autowired
	Slave1DataBaseMapper slave1DataBaseMapper;
	
	@Override
	public List<CountryModel> getCountry() throws Exception {
		return slave1DataBaseMapper.getCountry();
	}

}
