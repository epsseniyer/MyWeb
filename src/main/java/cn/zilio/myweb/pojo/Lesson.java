package cn.zilio.myweb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    Integer vedioId;
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
