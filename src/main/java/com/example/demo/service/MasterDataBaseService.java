package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SalaryModel;

public interface MasterDataBaseService {
	List<SalaryModel> getSalary() throws Exception;
}
