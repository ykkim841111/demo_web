package com.example.demo.mapper.slave1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CountryModel;

@Repository
@Mapper
@MapperScan(value="com.example.demo.mapper.slave1")
public interface Slave1DataBaseMapper {
	public List<CountryModel> getCountry() throws Exception;
}
