package ew.demo.controller;

import ew.demo.common.BaseResult;
import ew.demo.common.BootstrapTable;
import ew.demo.dao.SchoolMapper;
import ew.demo.model.BaseModelExample;
import ew.demo.model.School;
import ew.demo.model.User;
import ew.demo.service.SchoolService;
import ew.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;
    @RequestMapping("/")
    public String Login() {
        return "login";
    }

    @RequestMapping("/login.json")
    @ResponseBody
    // Map:让ajax接收数据
    public BaseResult receiveDate(@RequestBody Map<String, Object> loginData) {
//        Map<String, Object> map = new HashMap<>();
//        String loginName = loginData.get("loginName").toString();
//
//        System.out.println("....Controller");
//        return map;
//    }
        BaseResult baseResult = new BaseResult();
        String name = loginData.get("loginName").toString();
        String pwd = loginData.get("loginPwd").toString();
        User user = userService.selByName(name);
        System.out.println("controller的user:" + user);
        if (user.getPassWord().equals(pwd)) {
            baseResult.setSuccess(true);
        } else {
            baseResult.setSuccess(false);

        }
        return baseResult;
    }

    @RequestMapping(value = "/dashboard.html")
    public String test() {

        return "dashboard";
    }


}

