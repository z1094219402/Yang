package com.yang.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties.Packages;
import org.springframework.context.annotation.ComponentScans;

import com.yang.main.aop.DemoBean;

@SpringBootApplication
@MapperScan("com.yang.main.dataoperator")
public class YangkenApplication {

//	public YangkenApplication(DemoBean demoBean) {
//        String ans = demoBean.randUUID(System.currentTimeMillis());
//        System.out.println("----- ans: " + ans + "---------");
//    }
	
	public static void main(String[] args) {
		SpringApplication.run(YangkenApplication.class, args);
	}

}
