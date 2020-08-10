package com.yang.main.controllers;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/admin")
@CrossOrigin
//@PropertySource("classpath:application-dev.properties")
public class AdminControllers {
	
//	@Value("${count}")
	private String port;

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public JSONObject index(HttpServletRequest request) {
		System.out.println(port+"================="+request.getParameter("year"));
		JSONObject json = new JSONObject();
		json.put("name", "SUCCESSFULLY QUERY DATA FROM YANG'S WEBSITE!");
		return json;
	}
	
}
