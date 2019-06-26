package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.UserDao;
import cn.zilio.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    public User getUserById(String uid) throws Exception {
        return userDao.findUserByUid(uid);
    }

    public User getUserByEmail(String email) throws Exception{
        return userDao.findUserByEmail(email);
    }

    @Override
    public User addUser(User user) {
        return userDao.saveAndFlush(user);
    }
}
