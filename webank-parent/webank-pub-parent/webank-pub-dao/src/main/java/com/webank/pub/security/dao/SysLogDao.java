package com.webank.pub.security.dao;

import com.webank.pub.model.security.po.SysLog;
import com.webank.pub.model.security.po.query.SysLogQuery;

import java.util.List;


/**
 * @desc 系统日志 Dao层接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午11:17:17
 */
public interface SysLogDao {
	
	/**
	 * 根据检索条件获取系统日志的数量
	 * @param sysLogQuery
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午05:40:37
	 * @version V1.0
	 */
	Integer getSysLogCountByQuery(SysLogQuery sysLogQuery);
	
	/**
	 * 根据检索条件获取系统日志的记录信息
	 * @param sysLogQuery
	 * @return List<SysLog>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午05:40:37
	 * @version V1.0
	 */
	List<SysLog> getSysLogInfoByQuery(SysLogQuery sysLogQuery);
	
	/**
	 * 新增系统日志信息
	 * @param sysLog
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午05:40:37
	 * @version V1.0
	 */
	Integer addNewSysLog(SysLog sysLog);
	
	/**
	 * 根据系统日志id删除系统日志信息 物理删除
	 * @param sysLogId
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午05:40:37
	 * @version V1.0
	 */
	Integer deleteSysLogById(Long sysLogId);

}
