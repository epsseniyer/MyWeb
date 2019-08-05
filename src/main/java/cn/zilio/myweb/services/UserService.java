package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.User;

import java.util.Map;

public interface UserService {
    boolean userValidation(User user) throws Exception;

    User updateUser(User user) throws Exception;

    Map<Integer, User> addUser(User user) throws Exception;

    User findUser(User user) throws Exception;

    boolean userEmailValidate(String email) throws Exception;

    boolean userUsernameValidate(String username) throws Exception;
}
