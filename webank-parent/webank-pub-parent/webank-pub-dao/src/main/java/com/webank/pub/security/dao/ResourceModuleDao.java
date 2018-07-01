package com.webank.pub.security.dao;

import com.webank.pub.model.security.po.ResourceModule;

import java.util.List;

/**
 * @desc 系统资源模块信息的DAO 接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午08:24:55
 */
public interface ResourceModuleDao {
	
	/**
	 * 根据模块id集合获取资源模块信息
	 * @param idList
	 * @return List<ResourceModule>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<ResourceModule> getResourceModuleInfoByIdList(List<Long> idList);

}
