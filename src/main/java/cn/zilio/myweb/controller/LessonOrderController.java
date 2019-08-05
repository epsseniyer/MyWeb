package cn.zilio.myweb.controller;

import cn.zilio.myweb.pojo.LessonOrder;
import cn.zilio.myweb.services.LessonService;
import cn.zilio.myweb.services.UserService;
import cn.zilio.myweb.services.LessonOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lessonOrder")
public class LessonOrderController {
    @Autowired
    UserService userService;
    @Autowired
    LessonService lessonService;
    @Autowired
    LessonOrderService lessonOrderService;

    public LessonOrder submitLessonOrder() {
        return null;
    }

    public LessonOrder queryLessonOrder() {
        return null;
    }
}
