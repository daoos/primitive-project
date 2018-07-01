package com.webank.pub.security.dao;


import com.webank.pub.model.security.po.ResourcesSub;

import java.util.List;

/**
 * @desc 系统子资源信息 Dao 接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午08:24:55
 */
public interface ResourcesSubDao {
	
	/**
	 * 根据资源id集合 获取子资源信息集合
	 * @param resourceIdList
	 * @return List<ResourcesSub>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<ResourcesSub> getSubResourcesByRIdList(List<Long> resourceIdList);


	/**
	 * 获取所有的子资源信息集合
	 * @return
	 */
	List<ResourcesSub> getAllSubResources();

}
