package com.webank.pub.common.constant;

/**
 * @desc 作业执行状态执行枚举类
 * @author liangyongjian
 * @Version V1.0
 * @create 2017年9月28日 下午5:55:55
 */
public enum EnumJobStatus {

	//成功状态
	SUCCESS(1),
	
	//失败状态
	FAILURE(0);

	private Integer status;
	
	private EnumJobStatus(Integer status){
		this.status = status;
	}
	
	public Integer status(){
		return this.status;
	}
	
	public Integer getStatus(){
		return this.status;
	}
}
