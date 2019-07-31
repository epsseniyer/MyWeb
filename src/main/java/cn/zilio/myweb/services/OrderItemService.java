package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.Item;
import cn.zilio.myweb.pojo.Order;
import cn.zilio.myweb.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem findOrderItemById(Integer orderItemId);

    Item findItemByOrderItemId(Integer orderItemId);

    Integer findAmountByOrderItemId(Integer orderItemId);

    Order findOrderByOrderItemId(Integer orderItemId);

    List<OrderItem> findAllOrderItemByOrderId(Integer orderId);
}
