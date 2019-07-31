package cn.zilio.myweb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vediosrc")
public class VedioSrc {
    @Id
    Integer vedioId;
    @Column(name = "course_id", nullable = false)
    Integer courseId;
    @Column(name = "vedio_path", nullable = false)
    String vedioPath;
    @Column(name = "vedio_name", nullable = false)
    String vedioName;
    @Column(name = "vedio_introduce", nullable = false)
    String vedioIntroduce;
    @Column(name = "user_id", nullable = false)
    Integer userId;
}
