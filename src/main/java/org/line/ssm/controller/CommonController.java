package org.line.ssm.controller;

import org.line.ssm.pojo.CommonBean;
import org.line.ssm.service.ICommonService;
import org.line.ssm.utils.page.pageAjaxVo;
import org.line.ssm.utils.page.pageParamVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView login() {
		return new ModelAndView("/common.ftl");
	}

	/**
	 * datatable 分页接口
	 * */
	@RequestMapping("/list")
	@ResponseBody
	public pageAjaxVo<CommonBean> queryList(pageParamVo page) {
		pageAjaxVo<CommonBean> byPage = commonService.queryByPage(page);
		return byPage;
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
