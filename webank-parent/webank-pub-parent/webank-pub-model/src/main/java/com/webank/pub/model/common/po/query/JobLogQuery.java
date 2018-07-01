package com.webank.pub.model.common.po.query;

import com.webank.pub.model.po.BasePaginationQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liangyongjian
 * @desc 同步日志信息
 * @create 2018-01-21 21:41
 **/
@Getter
@Setter
public class JobLogQuery extends BasePaginationQuery {

    private Long id; // 主键id
    private Integer status; // 主键id
}
