package cn.bdqn.controller;

import cn.bdqn.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.controller
 * @Description: 用户
 * @Author 杨
 * @Create 2021年05月06日 15时46分41秒
 */
@Controller 
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping("/doLogin")
    public Map<String,Object> doLogin(String username, String password){
        System.out.println(username);
        System.out.println(password);
        Map<String,Object> map = userService.doLogin(username, password);
        return map;
    }

    @ResponseBody
    @RequestMapping("/queryAll")
    List<Map<String,Object>> queryAll(@RequestParam(value = "pageno",defaultValue = "1") Integer pageno){
        return userService.queryAll(pageno);
    }

}
