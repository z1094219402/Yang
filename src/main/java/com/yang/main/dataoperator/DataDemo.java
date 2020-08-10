package com.yang.main.dataoperator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//注解方式
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//
//		annotationConfigApplicationContext.register(DemoConfiguration.class);
//		
//		annotationConfigApplicationContext.refresh();
//		
//		Music music = (Music) annotationConfigApplicationContext.getBean("createMusic");
//		
//		music.setId(34);
//		music.setThings("wuliu");
//		music.setType("single");
//		System.out.println(music.toString());
		
		//xml方式
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:demo.xml");
		Music music2 = (Music) classPathXmlApplicationContext.getBean("createMusic");
		
//		music2.setId(123);
		music2.setThings("单曲循环");
		music2.setType("古典音乐");
		System.out.println("======================="+music2.toString());
	}

}
