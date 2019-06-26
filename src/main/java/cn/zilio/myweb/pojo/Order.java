package cn.zilio.myweb.pojo;

import cn.zilio.myweb.utils.OrderStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "orderid", nullable = false)
    Integer orderId;
    OrderStatus orderStatus;
    Date startDate;
    Date endDate;
    String userId;
    String transportId;
    Double orderPrice;
}
