package com.webank.pub.model.security.po;

import com.webank.pub.model.po.BasePo;
import lombok.Getter;
import lombok.Setter;

/**
 * @desc 用户名密码
 * @author liangyongjian
 * @Version V1.0
 * @create 2018-06-24 下午07:34:52
 */
@Getter
@Setter
public class UserPassword extends BasePo {

	private String password; // 原密码
	private String newPassword; // 新密码
	private String confirmNewPassword; // 新密码确认


	/**
	 * 去掉首尾空格
	 * @return void
	 * @throws
	 * @author liangyongjian
	 * @create 2018-06-24 下午09:15:10
	 * @version V1.0
	 */
	public void trim() {
		if (this.password != null)
			this.password = this.password.trim();
		
		if (this.newPassword != null)
			this.newPassword = this.newPassword.trim();
		
		if (this.confirmNewPassword != null)
			this.confirmNewPassword = this.confirmNewPassword.trim();
	}

}
