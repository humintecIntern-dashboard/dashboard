package com.humintecTest.dashboard.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humintecTest.dashboard.dao.TestDao;
import com.humintecTest.dashboard.request.TestRequestFormat;
import com.humintecTest.dashboard.vo.TestVo;

@Service
public class TestService {
	@Autowired
	TestDao testDao;
	
	public TestVo makeVo(TestRequestFormat req) {
		TestVo vo = new TestVo();
		
		vo.setUid((long) req.getUid());
		vo.setName(req.getName());
		vo.setAge((long) req.getAge());
		vo.setDate(new java.sql.Date(new Date().getTime()));
		
		return vo;
	}
	
	public List<TestVo> selectTestList(TestVo vo){
		return testDao.selectTestList(vo);
	}
	
	public List<TestVo> seletcTartget(TestVo vo){
		return testDao.selectTarget(vo);
	}
	
	public int insert(TestVo vo) {
		try {
			testDao.insertTest(vo);
			
			return 0;
		} catch (Exception e) {
			
			return -1;
		}
	}
	
	public int countList() {
		return testDao.countTest();
	}
	
	public int targetCountList(TestVo vo) {
		return testDao.targetCountTest(vo);
	}
}
