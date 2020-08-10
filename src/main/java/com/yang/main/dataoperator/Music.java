package com.yang.main.dataoperator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Music implements Serializable{

	
	private int id;
	
	private String type;
	
	private String things;
	
	private String timer;
	
	public Music() {
		this.timer = getCurrentTime();
	}
	
	public Music(String type,String things) {
//		this.id = id;
		this.things = things;
		this.type = type;
		this.timer = getCurrentTime();
//		this.timer = timer;
	}
	
	public Music(String type,String things,String timer) {
//		this.id = id;
		this.things = things;
		this.type = type;
		this.timer = timer;
	}
	
	private String getCurrentTime() {
		Date date = new Date();
//		long time = date.getTime();	//timestamp
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(date);
		return currentTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getThings() {
		return things;
	}

	public void setThings(String things) {
		this.things = things;
	}
	
	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	@Override
	public String toString() {
		return "Music[things="+this.things+",type="+this.type+",timer="+this.timer+"]";
	}
	
}
