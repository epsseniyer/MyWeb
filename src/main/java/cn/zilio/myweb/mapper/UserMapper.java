package cn.zilio.myweb.mapper;

import cn.zilio.myweb.pojo.User;

public interface UserMapper {
    User addUser(User user) throws Exception;

    User updateUser(User user) throws Exception;

    User findUserById(User user) throws Exception;

    User findUserByName(User user) throws Exception;
}
