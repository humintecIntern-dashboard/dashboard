package com.humintecTest.dashboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.humintecTest.dashboard.vo.TestVo;

@Mapper
public interface TestDao {
	public List<TestVo> selectTestList(TestVo vo);
	public List<TestVo> selectTarget(TestVo vo);
	public void insertTest(TestVo vo);
	public int countTest();
	public int targetCountTest(TestVo vo);
}
