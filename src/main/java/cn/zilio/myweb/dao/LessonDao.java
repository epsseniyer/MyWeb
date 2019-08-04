package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonDao extends JpaRepository<Lesson, Long> {
    Lesson saveAndFlush(Lesson lesson);

    Lesson findByLessonId(Integer lessonId) throws Exception;

    List<Lesson> findAllByCourseId(Integer courseId) throws Exception;

    Lesson findByLessonName(String name) throws Exception;

    Lesson findAllByUserId(String userId) throws Exception;

    void deleteAllByCourseId(Integer courseId) throws Exception;
}
