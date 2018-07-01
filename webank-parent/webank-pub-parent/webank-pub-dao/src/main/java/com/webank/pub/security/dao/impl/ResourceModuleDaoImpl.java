package com.webank.pub.security.dao.impl;

import com.webank.pub.dao.BaseDao;
import com.webank.pub.model.security.po.ResourceModule;
import com.webank.pub.security.dao.ResourceModuleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @desc 系统资源模块信息的DAO 实现类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 上午09:48:28
 */
@Repository(value="resourceModuleDao")
public class ResourceModuleDaoImpl extends BaseDao implements ResourceModuleDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceModuleDaoImpl.class);

	@Override
	public List<ResourceModule> getResourceModuleInfoByIdList(List<Long> idList) {
		if (idList == null) {
			LOGGER.error("Dao层：根据模块id集合获取资源模块信息，模块id集合参数为空");
			return null;
		}
		LOGGER.debug("DAO层：根据模块id集合获取资源模块信息");
		return getReadSqlSession().selectList("resourceModuleDao.selectResourceModuleInfoByIdList", idList);
	}

}
