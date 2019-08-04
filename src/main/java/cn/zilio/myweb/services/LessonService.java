package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.Lesson;

import java.util.List;

public interface LessonService {
    Lesson findLessonById(Integer lessonId) throws Exception;

    List<Lesson> findLessonByName(String lessonName) throws Exception;

    List<Lesson> findAllByCourseId(Integer courseId) throws Exception;

    List<Lesson> findAllByAuthor(Integer userId) throws Exception;

    Lesson addLesson(Lesson lesson);

    List<Lesson> addLessons(List<Lesson> lessons);

    void deleteLessonById(Lesson lesson) throws Exception;

    void deleteAllLesson(List<Lesson> lessons) throws Exception;

    Lesson updateLesson(Lesson lesson);

    List<Lesson> updateAll(List<Lesson> lessons);
}
