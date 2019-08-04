package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseDao extends JpaRepository<Course, Long> {
    Course saveAndFlush(Course course);

    Course findCourseById(Integer courseId) throws Exception;

    Course findCourseByName(String courseName) throws Exception;

    List<Course> findAllByCourseCode(Integer courseCode) throws Exception;

    List<Course> findAllByUserId(String userId) throws Exception;

    void deleteByCourseId(Integer courseId) throws Exception;
}
