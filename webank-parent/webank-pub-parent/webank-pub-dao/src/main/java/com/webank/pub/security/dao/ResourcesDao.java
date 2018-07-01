package com.webank.pub.security.dao;

import com.webank.pub.model.security.po.Resources;
import com.webank.pub.model.security.po.query.ResourcesQuery;

import java.util.List;

/**
 * @desc 系统资源信息的DAO 接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午08:24:55
 */
public interface ResourcesDao {
	
	/**
	 * 从数据库中系统所有资源信息
	 * @return List<Resources>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Resources> getAllResources();
	
	/**
	 * 根据资源id集合从数据库中获取资源信息
	 * @param idList
	 * @return List<Resources>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Resources> getResourceInfoByIdList(List<Long> idList);
	
	/**
	 * 获取用户登录后默认可以访问的资源，不受角色限制
	 * @return List<Resources>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Resources> getNonRestrictedResources();
	
	/**
	 * 根据检索条件获取系统资源的信息 
	 * @param resourcesQuery
	 * @return List<Resources>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Resources> getResourcesByQuery(ResourcesQuery resourcesQuery);

}
