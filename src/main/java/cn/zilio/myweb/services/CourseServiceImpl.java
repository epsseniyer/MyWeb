package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.CourseDao;
import cn.zilio.myweb.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> findCourseByName(String courseName) throws Exception {
        return null;
    }

    @Override
    public Course findCourseById(Integer courseId) throws Exception {
        return null;
    }

    @Override
    public List<Course> findCoursesByAuthor(Integer userId) throws Exception {
        return null;
    }

    @Override
    public void deleteCourseById(Integer courseId) throws Exception {

    }

    @Override
    public Course updateCourseById(Course course) throws Exception {
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> addCourses(List<Course> courses) throws Exception {
        return null;
    }
}
