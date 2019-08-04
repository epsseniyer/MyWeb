package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.Course;

import java.util.List;

public interface CourseService {
    List<Course> findCourseByName(String courseName) throws Exception;

    Course findCourseById(Integer courseId) throws Exception;

    List<Course> findCoursesByAuthor(Integer userId) throws Exception;

    void deleteCourseById(Integer courseId) throws Exception;

    Course updateCourseById(Course course) throws Exception;

    Course addCourse(Course course);

    List<Course> addCourses(List<Course> courses) throws Exception;
}
