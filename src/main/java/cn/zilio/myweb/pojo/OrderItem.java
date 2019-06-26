package cn.zilio.myweb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitem")
public class OrderItem {
    @Id
    @Column(name = "orderitemid", nullable = false)
    Integer orderItemId;
    Integer itemId;
    Integer orderId;
    Integer itemAmount;
}
