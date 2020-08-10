package com.yang.main.dataoperator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class DemoServiceImpl implements DemoService{

	@Autowired
	DataMapper mapper;
	
	@Override
	public List<Music> find() {
		// TODO Auto-generated method stub
		return mapper.find();
	}

	@Override
	public int insert(Music music) {
		// TODO Auto-generated method stub
		return mapper.insert(music);
	}

	@Override
	public int update(Music music) {
		// TODO Auto-generated method stub
		return mapper.update(music);
	}

	@Override
	public int insertList(List<Music> list) {
		// TODO Auto-generated method stub
		return mapper.insertList(list);
	}

}
