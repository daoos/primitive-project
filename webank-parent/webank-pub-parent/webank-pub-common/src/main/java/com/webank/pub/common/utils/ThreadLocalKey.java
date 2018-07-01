package com.webank.pub.common.utils;

import java.util.Map;

/**
 * @desc ThreadLocal 公共服务类
 * @author liangyongjian
 * @Version V1.0
 * @create 2017年9月28日 下午8:57:37
 */
public class ThreadLocalKey {
	
	public static final String JOB_SEQUENCE_NO = "jobSequenceNo";
	
	public static ThreadLocal<Map<String, Object>> threadLocalMap = new ThreadLocal<Map<String,Object>>();

}
