//package com.yang.main.dataoperator;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import utils.ObjectFactory;
//
////@ImportResource("classpath:demo.xml")
//@RestController
////@ComponentScan(basePackages = {"utils"})
//public class DataController {
//
//	@Autowired
//	@Qualifier(value="service")
//	private DemoService service;
//	
//	@Autowired
//	private ObjectFactory factory;
//	
//	@GetMapping(value="/demo")
//	public List<Music> getString() {
//		return service.find();
//	}
//	
//	@GetMapping(value="/insert")
//	public int insert() {
//		Music music = factory.getMusic();
//		music.setThings("太极拳");
//		music.setType("武术");
//		return service.insert(music);
//	}
//	
//	@GetMapping(value="/update")
//	public int update() {
//		Music music = factory.getMusic();
//		music.setId(15);
//		music.setThings("只狼");
//		music.setType("游戏");
//		return service.update(music);
//	}
//	
//	@GetMapping(value="/insertlist")
//	public int insertList() {
//		List<Music> list = factory.getMusicList();
//		int i = 0;
//		for(; i < 2000; i++) {
//			Music music = factory.getMusic();
//			music.setThings("见闻色_"+i);
//			music.setType("霸气_"+i);
//			list.add(music);
//		}
//		
//		return service.insertList(list);
//	}
//}
