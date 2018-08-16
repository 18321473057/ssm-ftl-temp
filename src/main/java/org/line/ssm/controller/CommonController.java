package org.line.ssm.controller;

import java.util.List;

import org.line.ssm.pojo.CommonBean;
import org.line.ssm.service.ICommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("common")
public class CommonController {

	@Autowired
	private ICommonService commonService;

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CommonController.class);

	// 测试基本功能
	@RequestMapping(value = "login", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView login(
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "passWord", required = true) String passWord) {
		List<CommonBean> beans = commonService.getBean(userName, passWord);
		ModelAndView mv = new ModelAndView("/common.ftl");
		mv.addObject("beans", beans);
		return mv;
	}

	// 测试事物
	@RequestMapping("addBean")
	@ResponseBody
	public String addBean() {
		String msg = "success";
		try {
			commonService.addBean();
		} catch (Exception e) {
			msg = "发生了错误信息";
			LOGGER.error(
					"org.line.ssm.controller.CommonController.addBean()发生了异常",
					e);
		}
		return msg;
	}
}
