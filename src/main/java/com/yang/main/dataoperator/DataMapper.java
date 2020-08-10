package com.yang.main.dataoperator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DataMapper {

	public List<Music> find();
	
	public int insert(Music music);
	
	public int update(Music music);
	
	public int insertList(List<Music> list);
}
