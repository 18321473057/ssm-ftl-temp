package org.line.ssm.mapper;

import java.util.List;

import org.line.ssm.pojo.CommonBean;

public interface ICommonMapper {
    List<CommonBean> getBean(String userName, String passWord);

    Long insetBean(CommonBean cBean);
}
