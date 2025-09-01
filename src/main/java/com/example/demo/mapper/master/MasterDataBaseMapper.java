package com.example.demo.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalaryModel;

@Repository
@Mapper
@MapperScan(value="com.example.demo.mapper.master")
public interface MasterDataBaseMapper {
	List<SalaryModel> getSalary();
}
