package com.webank.pub.security.dao;

import com.webank.pub.model.security.po.RoleResource;

import java.util.List;


/**
 * @desc 系统角色与系统资源关联信息 Dao 接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午08:24:55
 */
public interface RoleResourceDao {
	
	/**
	 * 获取数据库中所有的角色与资源关联信息
	 * @return List<RoleResource>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<RoleResource> getAllRoleResource();
	
	/**
	 * 根据角色id集合获取系统角色资源信息
	 * @param roleIdList
	 * @return List<RoleResource>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<RoleResource> getRoleResourceInfoByRoleIdList(List<Long> roleIdList);
	
	/**
	 * 根据角色id删除该角色对应的角色资源关系记录
	 * @param roleId
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer deleteRoleResourceByRoleId(Long roleId);
	
	/**
	 * 添加新的角色资源关系记录
	 * @param roleResource
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer addNewRoleResource(RoleResource roleResource);

}
