package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.User;

public interface UserService {
    public User getUserById(String uid) throws Exception;

    public User getUserByEmail(String email) throws Exception;

    public User getUserByName(String username) throws Exception;

    public User addUser(User user);

    public User updateUser(User user) throws Exception;

    public boolean userValidation(User user) throws Exception;
}
