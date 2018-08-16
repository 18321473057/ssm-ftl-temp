package org.line.ssm.service.impl;

import java.util.List;

import org.line.ssm.mapper.ICommonMapper;
import org.line.ssm.pojo.CommonBean;
import org.line.ssm.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommonServiceImpl implements ICommonService{

    @Autowired
    private ICommonMapper commonMapper;

    @Transactional(readOnly=true)
	public List<CommonBean> getBean(String userName, String passWord) {
        return commonMapper.getBean( userName,  passWord) ;
	}
    
    @Transactional(propagation =Propagation.REQUIRES_NEW)
	public Long addBean( ) {
    	CommonBean c = new CommonBean();
    	c.setUserName("ycs");
    	c.setPassWord(Math.random()+"");
    	commonMapper.insetBean(c);
    	c = new CommonBean();
    	c.setUserName("ycs");
    	int  i = 0/0;
    	c.setPassWord(Math.random()+"");
    	commonMapper.insetBean(c);
    	
    	return 1L;
	}
    
	 
    
}
