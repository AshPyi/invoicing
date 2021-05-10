package cn.bdqn.service;

import cn.bdqn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service
 * @Description:
 * @Author 杨
 * @Create 2021年05月06日 17时49分08秒
 */
@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public Map<String,Object> doLogin(String username, String password){
        return userMapper.doLogin(username, password);
    }

    public List<Map<String,Object>> queryAll(Integer pageno){
        return userMapper.queryAll();
    }
}
