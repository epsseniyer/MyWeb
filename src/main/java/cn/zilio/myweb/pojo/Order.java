package cn.zilio.myweb.pojo;

import cn.zilio.myweb.utils.OrderStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "orderid", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer orderId;
    @Column(name = "order_status", nullable = false)
    OrderStatus orderStatus;
    @Column(name = "start_date", nullable = false)
    Date startDate;
    @Column(name = "end_date", nullable = false)
    Date endDate;
    @Column(name = "user_id", nullable = false)
    String userId;
    @Column(name = "transport_id", nullable = false)
    String transportId;
    @Column(name = "order_price", nullable = false)
    Double orderPrice;
}
