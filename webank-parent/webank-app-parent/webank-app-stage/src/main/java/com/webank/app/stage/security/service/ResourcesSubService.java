package com.webank.app.stage.security.service;

import com.webank.pub.model.security.po.ResourcesSub;

import java.util.List;

/**
 * @desc 系统子资源信息 服务层接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2017-09-24 下午06:13:18
 */
public interface ResourcesSubService {
	
	/**
	 * 根据资源id集合 获取子资源信息集合
	 * @param resourceIdList
	 * @return List<ResourcesSub>
	 * @throws
	 * @author liangyongjian
	 * @create 2017-09-24 下午06:17:54
	 * @version V1.0
	 */
	public List<ResourcesSub> getSubResourcesByRIdList(List<Long> resourceIdList);

	/**
	 * 获取所有的子资源信息集合
	 * @return
	 */
	public List<ResourcesSub> getAllSubResources();

}
