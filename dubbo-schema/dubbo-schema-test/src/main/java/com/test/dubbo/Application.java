package com.test.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/*.xml");
		SimpleDateFormat defaultDateFormat = (SimpleDateFormat)ctx.getBean("defaultDateFormat");
		String format = defaultDateFormat.format(new Date());
		System.out.println(format);

		SimpleDateFormat dateformat = (SimpleDateFormat)ctx.getBean("dateFormat");
		String format2 = dateformat.format(new Date());
		System.out.println(format2);

	}
}
