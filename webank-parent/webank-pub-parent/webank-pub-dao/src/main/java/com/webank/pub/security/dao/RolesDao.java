package com.webank.pub.security.dao;

import com.webank.pub.model.security.po.Roles;
import com.webank.pub.model.security.po.query.RolesQuery;

import java.util.List;


/**
 * @desc 系统角色信息的DAO 接口类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午08:24:55
 */
public interface RolesDao {
	
	/**
	 * 从数据库中获取所有的系统角色信息
	 * @return List<Roles>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Roles> getAllRoles();
	
	/**
	 * 根据检索条件获取符合条件的角色数量
	 * @param rolesQuery
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer getRolesCountByQuery(RolesQuery rolesQuery);
	
	/**
	 * 根据检索条件获取符合条件的角色信息
	 * @param rolesQuery
	 * @return List<Roles>
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	List<Roles> getRolesInfoByQuery(RolesQuery rolesQuery);
	
	/**
	 * 根据角色id获取角色信息
	 * @param roleId
	 * @return Roles
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Roles getRoleInfoById(Long roleId);
	
	/**
	 * 添加新角色
	 * @param role
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer addNewRole(Roles role);

	/**
	 * 根据角色id修改角色信息
	 * @param role
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer updateRoleInfo(Roles role);
	
	/**
	 * 根据角色名称和id精确查找符合条件的角色数量
	 * @param rolesQuery
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer getRoleCountByName(RolesQuery rolesQuery);
	
	/**
	 * 根据角色id删除角色信息
	 * @param roleId
	 * @return Integer
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午08:24:55
	 * @version V1.0
	 */
	Integer deleteRoleById(Long roleId);

}
