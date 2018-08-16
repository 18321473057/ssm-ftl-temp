package org.line.ssm.service;

import java.util.List;

import org.line.ssm.pojo.CommonBean;

public interface ICommonService {

    List<CommonBean> getBean(String userName,String passWord);

    Long addBean( );
}
