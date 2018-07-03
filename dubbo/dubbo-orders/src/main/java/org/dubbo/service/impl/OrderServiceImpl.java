package org.dubbo.service.impl;

import org.dubbo.pojo.Orders;
import org.dubbo.service.IOrderService;

public class OrderServiceImpl implements IOrderService {

    public Orders getOrdersById(Integer orderId) {
        Orders orders = new Orders();
        orders.setAdr("上海市");
        orders.setBuyName("root");
        orders.setGoodsName("Iphone 999");
        orders.setPrice(9999);
        orders.setOrderId(20180702);
        if(orderId.equals(orders.getOrderId())){
            return orders;
        }
        return null;
    }
}
