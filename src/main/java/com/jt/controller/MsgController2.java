package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value="classpath:/properties/msg.properties",
		encoding="UTF-8")

public class MsgController2 {

	@Value("${msg.username2}")
	private String username;
	@Value("${msg.age2}")
	private Integer age;
	
	
	@RequestMapping("/getMsg2")
	public String getMsg2() {
		
		return"返回结果:"+username +":"+age;
	}
}
