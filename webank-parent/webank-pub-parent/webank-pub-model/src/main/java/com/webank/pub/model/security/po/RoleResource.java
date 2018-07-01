package com.webank.pub.model.security.po;

import com.webank.pub.model.po.BusinessBasePo;
import lombok.Getter;
import lombok.Setter;

/**
 * @desc 系统角色与资源关联信息 实体类
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午07:34:52
 */
@Getter
@Setter
public class RoleResource extends BusinessBasePo {

	private Long roleId; // 角色id
	private Long resourceId; // 资源id
	private Long createUserId; // 创建者的用户ID
	private Long updateUserId; // 修改者的用户ID
	private String note;// 备注

}
