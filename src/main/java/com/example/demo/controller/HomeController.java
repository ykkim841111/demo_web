package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CountryModel;
import com.example.demo.model.SalaryModel;
import com.example.demo.service.MasterDataBaseService;
import com.example.demo.service.SalaryService;
import com.example.demo.service.Slave1DataBaseService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
//	@Autowired
//	SalaryService salaryService;
	@Autowired
	MasterDataBaseService masterDataBaseService;
	
	@Autowired
	Slave1DataBaseService slave1DataBaseService;
	
//	@GetMapping("/home")
//	public ModelAndView goHome(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		List<SalaryModel> salaryList = new ArrayList<>();
//		
////		SalaryModel salaryModel = new SalaryModel();
////		
////		salaryModel = new SalaryModel();
////		salaryModel.setId(1);
////		salaryModel.setName("AAA");
////		salaryModel.setEmail("AAA@example.com");
////		salaryList.add(salaryModel);
////		
////		salaryModel = new SalaryModel();
////		salaryModel.setId(2);
////		salaryModel.setName("BBB");
////		salaryModel.setEmail("BBB@example.com");
////		salaryList.add(salaryModel);
////		
////		salaryModel = new SalaryModel();
////		salaryModel.setId(3);
////		salaryModel.setName("CCC");
////		salaryModel.setEmail("CCC@example.com");
////		salaryList.add(salaryModel);
//		
//		SalaryModel salaryModel = null;
//		
//		salaryModel = SalaryModel.builder()
//				.id(1)
////				.name("AAA")
//				.email("AAA@example.com")
//				.build();
//		salaryList.add(salaryModel);
//		
//		salaryModel = SalaryModel.builder()
//				.id(2)
//				.name("BBB")
//				.email("BBB@example.com")
//				.build();
//		salaryList.add(salaryModel);
//		
//		salaryModel = SalaryModel.builder()
//				.id(3)
//				.name("CCC")
//				.email("CCC@example.com")
//				.build();
//		salaryList.add(salaryModel);
//		
//		mav.addObject("salaryList", salaryList);
//		mav.setViewName("content/home");
//		
//		return mav;
//	}
//	@GetMapping("/home")
//	public ModelAndView goHome(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		
//		List<SalaryModel> salaryList = salaryService.getSalary();
//		
//		mav.addObject("salaryList", salaryList);
//		mav.setViewName("content/home");
//		
//		return mav;
//	}
	@GetMapping("/home")
	public ModelAndView goHome(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		List<SalaryModel> salaryList = masterDataBaseService.getSalary();
		List<CountryModel> countryList = slave1DataBaseService.getCountry();
		
		mav.addObject("salaryList", salaryList);
		mav.addObject("countryList", countryList);
		mav.setViewName("content/home");
		
		return mav;
	}
//	@GetMapping("/home")
//	public String goHome(Model model) {
//		List<String> resultList = new ArrayList<String>();
//		
//		resultList.add("AAA");
//		resultList.add("BBB");
//		resultList.add("CCC");
//		resultList.add("DDD");
//		resultList.add("EEE");
//		resultList.add("FFF");
//		
//		model.addAttribute("resultList",resultList);
//		
//		return "content/home";
//	}
}
