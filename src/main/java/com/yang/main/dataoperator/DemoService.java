package com.yang.main.dataoperator;

import java.util.List;

public interface DemoService {

	public List<Music> find();
	
	public int insert(Music music);
	
	public int update(Music music);
	
	public int insertList(List<Music> list);
}
