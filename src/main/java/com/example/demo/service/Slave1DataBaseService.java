package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CountryModel;

public interface Slave1DataBaseService {
	List<CountryModel> getCountry() throws Exception;
}
