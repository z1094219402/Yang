package com.yang.main.dataoperator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

	@Bean
	public Music createMusic() {
		System.out.println("THE BEAN IS INITAL.....");
		return new Music();
	}
}
