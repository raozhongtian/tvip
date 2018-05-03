package cn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartz {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/cn/quartz/application-quartz-context.xml");
	
	}
}
