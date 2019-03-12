package com.test.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: WangSaiChao
 * @date: 2019/2/21
 * @description: 启动类
 */
@SpringBootApplication
@ImportResource("classpath:spring/*.xml")
@ComponentScan(basePackages = "com.test.dubbo")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//排除数据源,默认没有数据源无法启动
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
