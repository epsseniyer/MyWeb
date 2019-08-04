package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.LessonDao;
import cn.zilio.myweb.pojo.Lesson;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LessonServiceImpl implements LessonService {
    @Autowired
    LessonDao lessonDao;
    @Override
    public Lesson findLessonById(Integer lessonId) throws Exception {
        return null;
    }

    @Override
    public List<Lesson> findLessonByName(String lessonName) throws Exception {
        return null;
    }

    @Override
    public List<Lesson> findAllByCourseId(Integer courseId) throws Exception {
        return null;
    }

    @Override
    public List<Lesson> findAllByAuthor(Integer userId) throws Exception {
        return null;
    }

    @Override
    public Lesson addLesson(Lesson lesson) {
        return null;
    }

    @Override
    public List<Lesson> addLessons(List<Lesson> lessons) {
        return null;
    }

    @Override
    public void deleteLessonById(Lesson lesson) throws Exception {

    }

    @Override
    public void deleteAllLesson(List<Lesson> lessons) throws Exception {

    }

    @Override
    public Lesson updateLesson(Lesson lesson) {
        return null;
    }

    @Override
    public List<Lesson> updateAll(List<Lesson> lessons) {
        return null;
    }
}
