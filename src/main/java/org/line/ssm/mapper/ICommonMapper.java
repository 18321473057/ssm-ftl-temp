package org.line.ssm.mapper;

import java.util.List;

import org.line.ssm.pojo.CommonBean;

import tk.mybatis.mapper.common.Mapper;

public interface ICommonMapper extends Mapper<CommonBean> {
    List<CommonBean> getBean(String userName, String passWord);

    Long insetBean(CommonBean cBean);
}
