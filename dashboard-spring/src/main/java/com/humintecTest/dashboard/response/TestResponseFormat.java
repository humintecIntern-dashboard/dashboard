package com.humintecTest.dashboard.response;

import java.sql.Date;

import com.humintecTest.dashboard.vo.TestVo;

import lombok.Data;

@Data
public class TestResponseFormat {
	private Long uid;
	private String name;
	private Date date;
	private Long age;
	
	public TestResponseFormat(TestVo vo){
		uid = vo.getUid();
		name = vo.getName();
		date = vo.getDate();
		age = vo.getAge();
	}
}
