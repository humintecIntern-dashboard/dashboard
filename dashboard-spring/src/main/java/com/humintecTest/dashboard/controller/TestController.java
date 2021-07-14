package com.humintecTest.dashboard.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.humintecTest.dashboard.request.TestRequestFormat;
import com.humintecTest.dashboard.response.TestResponseFormat;
import com.humintecTest.dashboard.service.TestService;
import com.humintecTest.dashboard.vo.TestVo;

@RestController
public class TestController {
	@Autowired
	TestService testService;
	
	@GetMapping("/testList")
	@Transactional(readOnly = true)
	public List<TestResponseFormat> selectTestList(@RequestBody TestRequestFormat req){
		TestVo vo = new TestVo();
		List<TestVo> vList = testService.selectTestList(vo);
		
		ArrayList<TestResponseFormat> res = new ArrayList<TestResponseFormat>();
		
		for(TestVo target : vList) {
			res.add(new TestResponseFormat(target));
		}
		
		return res;
	}
	
	@GetMapping("/testTarget")
	@Transactional(readOnly = true)
	public List<TestResponseFormat> testTarget(@RequestBody TestRequestFormat req){
		TestVo vo = testService.makeVo(req);
		
		List<TestVo> vList = testService.seletcTartget(vo);
		
		if(vList.isEmpty() == true) {
			
			return null;
		}
		
		ArrayList<TestResponseFormat> res = new ArrayList<TestResponseFormat>();
		
		for(TestVo target : vList) {
			res.add(new TestResponseFormat(target));
		}
		
		return res;
	}
	
	@PutMapping("/insertTest")
	@Transactional(readOnly = false)
	public String insertTest(@RequestBody TestRequestFormat req) {
		TestVo vo = testService.makeVo(req);
		
		if(testService.insert(vo) == 0) {
			return "ok";
		}
		else {
			return "false";
		}
	}
	
	@GetMapping("/countTest")
	@Transactional(readOnly = true)
	public int countTest(@RequestBody TestRequestFormat req) {
		TestVo vo = testService.makeVo(req);
		
		return testService.countList();
	}
	
	@GetMapping("/targetCountTest")
	@Transactional(readOnly = true)
	public int targetCountTest(@RequestBody TestRequestFormat req) {
		TestVo vo = testService.makeVo(req);
		
		return testService.targetCountList(vo);
	}
}
