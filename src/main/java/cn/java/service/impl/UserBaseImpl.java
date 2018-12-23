package cn.java.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.java.service.UserBaseInter;
/**
 * @author Administrator
 *
 */
public class UserBaseImpl implements UserBaseInter {

	public final static Map<String, Object> reqMap = new HashMap<>();
	
	private String name="测试";
	
	private String name1="测试";
	
	private String name2="测试";
	
	private String name3="测试";

	private String name4="测试";

	private String code="001";
	
	private int a=1;
	
	private boolean flag=false;
	
	private Long id=1L;
	
	private Long sex=2L;
	
	@Override
	public void insert(Map<String, Object> map) {

	}

	@Override
	public List<Map<String, Object>> getList() {

		return null;
	}
}
