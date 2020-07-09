package com.jt.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//springBoot最为重要的入口注解
public class SpringBootRun {
/**
 * 1.
 * 上述注解是元注解
 * 
 * @SpringBootConfiguration springBOOT的主启动类就是一配置文件
 * @EnableAutoCondiguration
 * 开箱即用
 * @AutoConfigurationPackage
 * 定义包扫描的路径信息
 * @Import(AutoConfigurationImportSelect.class
 * 
 * @param args
 */
	
	public static void main(String[] args) {
SpringApplication.run(SpringBootRun.class, args);

	}
}
