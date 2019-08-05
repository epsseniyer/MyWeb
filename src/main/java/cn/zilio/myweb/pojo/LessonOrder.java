package cn.zilio.myweb.pojo;

import cn.zilio.myweb.utils.LessonOrderStatus;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lesson_order")
@GenericGenerator(name = "jpa_lesson_order_id", strategy = "auto")
public class LessonOrder {
    @Id
    @GeneratedValue(generator = "jpa_lesson_order_id")
    @Column(name = "lesson_order_id")
    Integer courseOrderId;
    @Column(name = "lesson_id", nullable = false)
    Integer courseId;
    @Column(name = "user_id", nullable = false, length = 40)
    String userId;
    @Column(name = "lesson_order_status", nullable = false)
    LessonOrderStatus courseOrderStatus;
    @Column(name = "lesson_order_date", nullable = false)
    Date lessonOrderDate;

    public Integer getCourseOrderId() {
        return courseOrderId;
    }

    public void setCourseOrderId(Integer courseOrderId) {
        this.courseOrderId = courseOrderId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LessonOrderStatus getCourseOrderStatus() {
        return courseOrderStatus;
    }

    public void setCourseOrderStatus(LessonOrderStatus courseOrderStatus) {
        this.courseOrderStatus = courseOrderStatus;
    }

    public Date getLessonOrderDate() {
        return lessonOrderDate;
    }

    public void setLessonOrderDate(Date lessonOrderDate) {
        this.lessonOrderDate = lessonOrderDate;
    }
}
