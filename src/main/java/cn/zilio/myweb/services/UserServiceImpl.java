package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.UserDao;
import cn.zilio.myweb.pojo.User;
import cn.zilio.myweb.utils.UserStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public boolean userValidation(User user) throws Exception {
        boolean validResult = false;
        User u = getUser(user);
        if(u != null && u.getPassword().equals(user.getPassword())) {
            validResult = true;
        }
        return validResult;
    }

    @Override
    public User updateUser(User user) throws Exception {
        User u = getUser(user);
        if(user.getEmail() != null) {
            u.setEmail(user.getEmail());
        }
        if(user.getPassword() != null) {
            u.setPassword(user.getPassword());
        }
        if(user.getUserLastLogin()  != null) {
            u.setUserLastLogin(new Date());
        }
        if(user.getPhoneNumber() != null) {
            u.setPhoneNumber(user.getPhoneNumber());
        }
        if(user.getUserCoin() != 0) {
            u.setUserCoin(user.getUserCoin());
        }
        if(user.getUserBalance() != 0) {
            u.setUserBalance(user.getUserBalance());
        }
        if(user.getAge() != 0) {
            u.setAge(user.getAge());
        }
        if(user.getName() != null) {
            u.setName(user.getName());
        }
        return userDao.saveAndFlush(u);
    }

    @Override
    public Map<Integer, User> addUser(User user) throws Exception {
        Map<Integer, User> result = new HashMap<Integer, User>();
        User u = null;
        if(user.getUid() != null) {
            u = userDao.findUserByUid(user.getUid());
            if(u != null) {
                result.put(UserStatusCode.USERID_DUPLICATED, user);
            }
        }
        if(user.getUsername() != null) {
            u = userDao.findUserByUsername(user.getUsername());
            if(u != null) {
                result.put(UserStatusCode.USERNAME_DUPLICATED, user);
            }
        }
        if(user.getEmail() != null) {
            u = userDao.findUserByEmail(user.getEmail());
            if(u != null) {
                result.put(UserStatusCode.USEREMAIL_DUPLICATED, user);
            }
        }
        if(result.isEmpty()) {
            u = userDao.saveAndFlush(user);
            result.put(UserStatusCode.USER_UNKNOWN, u);
        }
        return result;
    }

    @Override
    public User findUser(User user) throws Exception {
        if(userValidation(user)) {
            return getUser(user);
        }
        return null;
    }

    @Override
    public boolean userEmailValidate(String email) throws Exception {
        boolean result = false;
        if(userDao.findUserByEmail(email) == null) {
            result = true;
        }
        return result;
    }

    @Override
    public boolean userUsernameValidate(String username) throws Exception {
        boolean result = false;
        if(userDao.findUserByUsername(username) == null) {
            result = true;
        }
        return result;
    }

    private User getUser(User user) throws Exception {
        User u = null;
        if(user.getUid() != null && user.getPassword() != null) {
            u = userDao.findUserByUid(user.getUid());
        } else if(user.getUsername() != null && user.getPassword() != null) {
            u = userDao.findUserByUsername(u.getUsername());
        } else if(user.getEmail() != null && user.getPassword() != null) {
            u = userDao.findUserByEmail(user.getEmail());
        }
        return u;
    }
}
