package com.xinfuli.yy.demo.baseMapper;

/**
 * 
 * @ClassName: BaseMapper 
 * @Description: BaseMapper
 * @author ilidan_Y
 * @date 2017年10月26日 上午9:32:59 
 *
 */
public interface BaseMapper<T> {
	
	void insert(T entity);

	void update(T entity);

}
