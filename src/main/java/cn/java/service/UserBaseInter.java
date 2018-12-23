package cn.java.service;

import java.util.List;
import java.util.Map;

public interface UserBaseInter {

	void insert(Map<String,Object> map);
	
	List<Map<String,Object>> getList();
}
