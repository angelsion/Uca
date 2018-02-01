package com.uca.service.impl;

import com.uca.dao.ResourceMapper;
import com.uca.entity.Resource;
import com.uca.service.ResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * ClassName: ResourceServiceImpl 
 * @Description: 资源服务实现类
 * @author puyijun
 * @date 2018-01-23
 */
@Transactional
@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

    @javax.annotation.Resource
    private ResourceMapper resourceMapper;


    /* (non-Javadoc)
     * @see org.csun.nc.component.ResourceService#resourceAdd(org.csun.nc.pojo.Resource)
     */
    @Override
    public void resourceAdd(Resource resource) {
        // TODO Auto-generated method stub
        resourceMapper.insertSelective(resource);
    }

    /* (non-Javadoc)
     * @see org.csun.nc.component.ResourceService#resourceShowById(java.lang.Integer)
     */
    @Override
    public Resource resourceShowById(Integer resourceId) {
        // TODO Auto-generated method stub
        return resourceMapper.selectByPrimaryKey(resourceId);
    }

    /* (non-Javadoc)
     * @see org.csun.nc.component.ResourceService#resourceDel(java.lang.Integer)
     */
    @Override
    public int resourceDel(Integer resourceId) {
        // TODO Auto-generated method stub
        return resourceMapper.deleteByPrimaryKey(resourceId);
    }

    /* (non-Javadoc)
     * @see org.csun.nc.component.ResourceService#resourceUpdate(org.csun.nc.pojo.Resource)
     */
    @Override
    public int resourceUpdate(Resource resource) {
        // TODO Auto-generated method stub
        return resourceMapper.updateByPrimaryKeySelective(resource);
    }

}
