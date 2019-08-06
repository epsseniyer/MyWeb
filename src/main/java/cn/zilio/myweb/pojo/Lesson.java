package cn.zilio.myweb.pojo;

import javax.persistence.*;

@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @Column(name = "lesson_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer lessonId;
    @Column(name = "course_id", nullable = false)
    Integer courseId;
    @Column(name = "lesson_vedio_path", nullable = false)
    String lessonVedioPath;
    @Column(name = "lesson_name", nullable = false)
    String lessonName;
    @Column(name = "lesson_introduce", nullable = false)
    String lessonIntroduce;
    @Column(name = "user_id", nullable = false)
    Integer userId;
    @Column(name = "comment_id", nullable = false)
    Integer commentId;
}
