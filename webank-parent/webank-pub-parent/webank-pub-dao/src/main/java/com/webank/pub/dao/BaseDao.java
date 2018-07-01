package com.webank.pub.dao;

import lombok.Getter;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import java.util.List;

/**
 * @desc MyBatis Dao基类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午07:37:50
 */
public class BaseDao implements Dao {

	@Resource(name = "webankSqlSession")
	private SqlSession writeSqlSession;

	@Getter
	@Resource(name = "webankSqlSession")
	private SqlSession readSqlSession;
	
	@Override
	public int insert(String myBatis, Object object) {
		return writeSqlSession.insert(myBatis, object);
	}

	@Override
	public Object select(String myBatis, Object object) {
		return readSqlSession.selectOne(myBatis, object);
	}

	@Override
	public int update(String myBatis, Object object) {
		return writeSqlSession.update(myBatis, object);
	}

	@Override
	public int delete(String myBatis, Object object) {
		return writeSqlSession.delete(myBatis, object);
	}

	@Override
	public int delete(String myBatis) {
		return writeSqlSession.delete(myBatis);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List selectList(String myBatis, Object object) {
		return readSqlSession.selectList(myBatis, object);
	}

}
