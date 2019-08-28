package org.line.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    // 测试基本功能
    @GetMapping(value = "index")
    @ResponseBody
    public ModelAndView login() {
        return new ModelAndView("/user.ftl");
    }
}
