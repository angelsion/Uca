package com.uca.service;

import com.uca.entity.Resource;

/**
 * ClassName: ResourceService 
 * @Description: 资源服务接口
 * @author puyijun
 * @date 2017-01-23
 */
public interface ResourceService {

	/**
	 * 添加资源
	 */
	public void resourceAdd(Resource resource);
	
	public Resource resourceShowById(Integer resourceId);
	
	public int resourceDel(Integer resourceId);
	
	public int resourceUpdate(Resource resource);

}
