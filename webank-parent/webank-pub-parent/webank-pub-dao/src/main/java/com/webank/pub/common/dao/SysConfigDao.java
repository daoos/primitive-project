package com.webank.pub.common.dao;

import com.webank.pub.model.common.po.SysConfig;

import java.util.List;

/**
 * @author liangyongjian
 * @desc 系统配置项信息 Dao层接口类
 * @create 2017-11-19 23:00
 **/
public interface SysConfigDao {

    /**
     * 获取所有的系统配置项信息
     * @return
     */
    List<SysConfig> getAllSysConfig();

    /**
     * 根据ID获取配置项信息的全部信息
     * @param sysConfigId
     * @return
     */
    SysConfig getSysConfigInfoById(Long sysConfigId);

    /**
     * 根据配置项名称获取配置项信息
     * @param configItem
     * @return
     */
    SysConfig getSysConfigByConfigItem(String configItem);

    /**
     * 更新配置项的值
     * @param sysConfig
     * @return
     */
    Integer updateSysConfig(SysConfig sysConfig);

}
