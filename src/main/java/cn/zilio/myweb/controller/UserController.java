package cn.zilio.myweb.controller;

import cn.zilio.myweb.pojo.User;
import cn.zilio.myweb.services.UserService;
import cn.zilio.myweb.utils.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@EnableAutoConfiguration
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "/User/queryByUid")
    public User queryUserByIdController(String uid) throws Exception {
        return userService.getUserById(uid);
    }
    @RequestMapping(path = "/User/QueryByEmail/{email}")
    public User queryUserByNameController(@PathVariable String email) throws Exception {
        return userService.getUserByEmail(email);
    }
   @RequestMapping(path = "/User/Register")
    public User registerUser(User user) {
        User u = new User();
        u.setPhoneNumber("+86-15202812000");
        u.setName("Yin Zhi");
        u.setEmail("273171192@11.com");
        u.setUsername("Lemon");
        u.setPassword("AA565885565885");
        u.setAge(5);
        u.setUserType(UserType.CUSTOMER);
        u.setUserBalance(0.0);
        u.setUserCoin(0);
        u.setUserLastLogin(new Date());
        u.setRegistDate(new Date());
        return userService.addUser(u);
    }
/*
    @RequestMapping(path = "/queryByName")
    public User queryUserByNameController(String name) {
        User user = new User();
        user.setEmail("jarwemailsky@126.com");
        user.setName("jarwe");
        user.setPhoneNumber("13308238167");
        user.setUid("asdfweqfasdfwqe");
        return user;
    }
*/
}
