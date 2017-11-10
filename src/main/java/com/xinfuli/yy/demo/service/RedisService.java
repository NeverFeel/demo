package com.xinfuli.yy.demo.service;

public interface RedisService {
	
	/**
	 * 
	 * @Title: set 
	 * @Description: 存储字符串
	 * @param @param key
	 * @param @param value  参数说明 
	 * @return void    返回类型 
	 * @throws
	 */
	void set(String key,String value);
	
	/**
	 * 
	 * @Title: get 
	 * @Description: 根据key获取字符串数据
	 * @param @param key
	 * @param @return  参数说明 
	 * @return Object    返回类型 
	 * @throws
	 */
	String get(String key);
	
	/**
	 * 
	 * @Title: hasKey 
	 * @Description: 判断key是否存在 
	 * @param @param key
	 * @param @return  参数说明 
	 * @return boolean    返回类型 
	 * @throws
	 */
	boolean hasString(String key);
	
	/**
	 * 
	 * @Title: deleteByKey 
	 * @Description: 删除key
	 * @param @param key
	 * @param @return  参数说明 
	 * @return boolean    返回类型 
	 * @throws
	 */
	void deleteString(String key);
	
	//-----------------------------字符串和对象操作分割线----------------------------//
	
	/**
	 * 
	 * @Title: set 
	 * @Description: 存储对象
	 * @param @param key
	 * @param @param student  参数说明 
	 * @return void    返回类型 
	 * @throws
	 */
	void setObject(String key, Object obj);
	
	/**
	 * 
	 * @Title: getObject 
	 * @Description: 根据key获取对象数据 
	 * @param @param key
	 * @param @return  参数说明 
	 * @return Object    返回类型 
	 * @throws
	 */
	Object getObject(String key);
	
	/**
	 * 
	 * @Title: hasObject 
	 * @Description: 判断缓存中的对象是否存在
	 * @param @param key
	 * @param @return  参数说明 
	 * @return boolean    返回类型 
	 * @throws
	 */
	boolean hasObject(String key);
	
	/**
	 * 
	 * @Title: deleteObject 
	 * @Description: 删除缓存中的某个对象 
	 * @param @param key  参数说明 
	 * @return void    返回类型 
	 * @throws
	 */
	void deleteObject(String key);
}
