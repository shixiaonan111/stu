package com.jt.controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;




@RestController
@ConfigurationProperties(prefix="msg")
@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
public class MsgController {
	/**
	@Value("${msg.username}")
	private String username;
	@Value("${msg.age}")
	private Integer age;
	*/
	private String  username;	//用户名
	private Integer age;
   








@RequestMapping("/getMsg")
	public String getMsg() {
	
	MsgController controller=new MsgController();
	controller.setUsername(username);
	return"返回结果:"+username +":"+age;
	}
	
}
