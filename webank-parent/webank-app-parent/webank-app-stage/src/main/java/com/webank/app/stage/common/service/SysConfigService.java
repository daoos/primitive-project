package com.webank.app.stage.common.service;

import com.webank.pub.common.web.PubModelMap;
import com.webank.pub.model.common.po.SysConfig;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author liangyongjian
 * @desc 系统配置项信息 服务类接口类
 * @create 2017-11-19 23:11
 **/
public interface SysConfigService {

    /**
     * 获取所有的系统配置项信息
     * @return
     */
    List<SysConfig> getAllSysConfig();

    /**
     * 查询系统配置项信息 用于配置项管理页面
     * @param model
     * @param method
     * @param request
     */
    void getSysConfigInfoForInitPage(ModelMap model, String method, HttpServletRequest request);


    /**
     * 根据配置项名称获取配置项信息
     * @param configItem
     * @return
     */
    SysConfig getSysConfigByConfigItem(String configItem);

    /**
     * 根据ID获取配置项信息的全部信息
     * @param sysConfigId
     * @return
     */
    SysConfig getExtendSysConfigInfoById(Long sysConfigId);

    /**
     * 更新配置项的值
     * @param sysConfig
     * @param request
     * @param modelMap
     * @return
     */
    boolean updateSysConfig(SysConfig sysConfig, HttpServletRequest request, PubModelMap modelMap);

}
