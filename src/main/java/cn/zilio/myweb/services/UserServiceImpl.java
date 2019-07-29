package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.UserDao;
import cn.zilio.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public User getUserByName(String username) throws Exception {
        return userDao.findUserByUsername(username);
    }

    @Override
    public User addUser(User user) {
        return userDao.saveAndFlush(user);
    }

    @Override
    public User updateUser(User user) throws Exception {
        User u = null;
        if(user.getUid() != null && user.getUid().length() > 0) {
            u = userDao.findUserByUsername(user.getUsername());
        } else if(user.getUsername() != null && user.getUsername().length() > 0) {
            u = userDao.findUserByEmail(user.getEmail());
        } else if(user.getEmail() != null && user.getEmail().length() > 0) {
            u = userDao.findUserByUid(user.getUid());
        }
        if(u != null) {
            if(user.getAge() != null) {
                u.setAge(user.getAge());
            }
            if(user.getEmail() != null) {
                u.setEmail(user.getEmail());
            }
            if(user.getPassword() != null) {
                u.setPassword(user.getPassword());
            }
            if(user.getUserBalance() != null && user.getUserBalance() != 0) {
                u.setUserBalance(user.getUserBalance());
            }
            if(user.getPhoneNumber() != null) {
                u.setPhoneNumber(user.getPhoneNumber());
            }
            if(user.getUserLastLogin() != null) {
                u.setUserLastLogin(new Date());
            }
            userDao.saveAndFlush(u);
        }
        return null;
    }

    @Override
    public boolean userValidation(User user) throws Exception {
        boolean result = false;
        if(user.getUsername() != null) {
            User u = userDao.findUserByUsername(user.getEmail());
            result = userVerifying(user, u);
        } else if(user.getEmail() != null) {
            User u = userDao.findUserByEmail(user.getEmail());
            result = userVerifying(user, u);
        } else if(user.getUid() != null) {
            User u = userDao.findUserByUid(user.getUid());
            result = userVerifying(user, u);
        }
        return result;
    }

    private boolean userVerifying(User user, User u) {
        boolean result = false;
        if(user.getUid() != null && user.getUid().equals(u.getUid()) && user.getPassword().equals(u.getPassword())) {
            result = true;
        } else if(user.getEmail() != null && user.getEmail().equals(u.getEmail()) && user.getPassword().equals(u.getPassword())) {
            result = true;
        } else if(user.getUsername()!= null && user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
            result = true;
        }
        return result;
    }
}
