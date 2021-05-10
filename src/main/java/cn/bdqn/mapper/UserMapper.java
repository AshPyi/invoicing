package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.mapper
 * @Description:
 * @Author 杨
 * @Create 2021年05月06日 15时47分38秒
 */
@Mapper
@Repository
public interface UserMapper {

    Map<String,Object> doLogin(@Param("username") String username, @Param("password")String password);

    List<Map<String,Object>> queryAll();

}
