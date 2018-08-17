package org.line.ssm.service;

import java.util.List;

import org.line.ssm.pojo.CommonBean;
import org.line.ssm.utils.page.pageAjaxVo;
import org.line.ssm.utils.page.pageParamVo;

public interface ICommonService {

    List<CommonBean> getBean(String userName,String passWord);

    Long addBean( );

    pageAjaxVo<CommonBean> queryByPage(pageParamVo page);
}
