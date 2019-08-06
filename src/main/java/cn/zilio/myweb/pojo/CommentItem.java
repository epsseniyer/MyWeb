package cn.zilio.myweb.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment_item")
@GenericGenerator(name = "comment_id", strategy = "auto")
public class CommentItem {
    @Id
    @Column(name = "comment_item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer commentItemId;
    @Column(name = "comment_id", nullable = false)
    Integer commentId;
    @Column(name = "uid", nullable = false, length = 40)
    String uid;
    @Column(name = "content", nullable = false, length = 200)
    String content;
    @Column(name = "date", nullable = false)
    Date date;
    @Column(name = "fans", nullable = false)
    Integer fans;
}
