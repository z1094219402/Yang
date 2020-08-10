package com.yang.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.yang.main.controllers.MyTest;

import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = YangkenApplication.class)
public class YangkenApplicationTests {

//	@Value("count")
//	public String num;
	
	@Autowired
	MyTest myTest;
//	
	@Test
	public void contextLoads() {
		
		System.out.println("==============="+myTest.corsFilter());
		redisTester();
	}
	
//	@Test
	public void redisTester() {
	    Jedis jedis = new Jedis("localhost", 6379, 100000);
	    int i = 0;
	    try {
	        long start = System.currentTimeMillis();// 开始毫秒数
	        while (true) {
	            long end = System.currentTimeMillis();
	            if (end - start >= 1000) {// 当大于等于1000毫秒（相当于1秒）时，结束操作
	                break;
	            }
	            i++;
	            jedis.set("test" + i, i + "");
	        }
	    } finally {// 关闭连接
	        jedis.close();
	    }
	    // 打印1秒内对Redis的操作次数
	    System.out.println("redis每秒操作：" + i + "次");
	}

}
