package cn.zilio.myweb.controller;

import cn.zilio.myweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "/queryByEmail")
    public String queryUserByIdController(String uid) {
        return null;
    }
}
