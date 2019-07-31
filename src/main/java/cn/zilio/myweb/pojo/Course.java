package cn.zilio.myweb.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    @Id
    Integer courseId;
    @Column(name = "course_name", nullable = false)
    String courseName;
    @Column(name = "course_introduce", nullable = false)
    String courseIntroduce;
    @Column(name = "userId", nullable = false)
    Integer userId;
    @Column(name = "course_code", nullable = false)
    Integer courseCode;
}
