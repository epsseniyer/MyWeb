package cn.zilio.myweb.controller;

import cn.zilio.myweb.pojo.Lesson;
import cn.zilio.myweb.services.LessonService;
import cn.zilio.myweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lesson")
public class LessonController {
    @Autowired
    UserService userService;
    @Autowired
    LessonService lessonService;

    public Lesson queryLesson() {
        return null;
    }
}
