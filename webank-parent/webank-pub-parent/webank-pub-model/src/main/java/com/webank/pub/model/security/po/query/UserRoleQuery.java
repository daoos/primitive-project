package com.webank.pub.model.security.po.query;

import com.webank.pub.model.po.BasePaginationQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * @desc 查询用户角色关联信息 Query类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午09:03:20
 */
@Getter
@Setter
public class UserRoleQuery extends BasePaginationQuery {

	private Long id;
	private Long userId; // 用户id
	private Long roleId; // 角色id

}
