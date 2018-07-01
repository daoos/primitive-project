package com.webank.pub.security.dao.impl;

import com.webank.pub.dao.BaseDao;
import com.webank.pub.model.security.po.SysLog;
import com.webank.pub.model.security.po.query.SysLogQuery;
import com.webank.pub.security.dao.SysLogDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @desc 系统日志 Dao层实现类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午11:20:30
 */
@Repository(value="sysLogDao")
public class SysLogDaoImpl extends BaseDao implements SysLogDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SysLogDaoImpl.class);

	@Override
	public Integer getSysLogCountByQuery(SysLogQuery sysLogQuery) {
		LOGGER.debug("Dao层：根据检索条件获取系统日志");
		return (Integer)getReadSqlSession().selectOne("sysLogDao.selectSysLogCountByQuery", sysLogQuery);
	}

	@Override
	public List<SysLog> getSysLogInfoByQuery(SysLogQuery sysLogQuery) {
		LOGGER.debug("Dao层：根据检索条件获取系统日志的记录信息");
		return getReadSqlSession().selectList("sysLogDao.selectSysLogInfoByQuery", sysLogQuery);
	}

	@Override
	public Integer addNewSysLog(SysLog sysLog) {
		LOGGER.debug("Dao层：添加新的系统日志");
		return insert("sysLogDao.insertNewSysLog", sysLog);
	}

	@Override
	public Integer deleteSysLogById(Long sysLogId) {
		LOGGER.debug("Dao层：根据系统日志id删除系统日志信息");
		return (Integer)delete("sysLogDao.deleteSysLogById", sysLogId);
	}

}
