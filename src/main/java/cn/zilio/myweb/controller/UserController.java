package cn.zilio.myweb.controller;

import cn.zilio.myweb.pojo.User;
import cn.zilio.myweb.utils.StatusCode;
import cn.zilio.myweb.utils.StringUtils;
import cn.zilio.myweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path="/User")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(path="/userLoginController")
    public Map<String, Object> userLoginController(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        HttpSession httpSession = request.getSession();
        String verifyCode = (String) httpSession.getAttribute(StringUtils.VERIFY_CODE);
        if(request.getParameter(StringUtils.VERIFY_CODE).equals(verifyCode)) {
            User user = userService.requestForUser(request.getParameter(StringUtils.USERNAME));
            if(user.getPassword().equals(request.getParameter(StringUtils.PASSWORD))) {
                result.put("returnCode", StatusCode.SUCCESS);
                result.put("user", user);
            } else {
                result.put("returnCode", StatusCode.WRONG_PASSWORD);
            }
        } else {
            result.put("returnCode", StatusCode.WRONG_VERIFYCODE);
        }
        return result;
    }

    @RequestMapping(path="/userRegistry", method = RequestMethod.POST)
    public Map<String, Object> userRegistry(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        return result;
    }
}
