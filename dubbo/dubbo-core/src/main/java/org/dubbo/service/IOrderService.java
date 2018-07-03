package org.dubbo.service;

import org.dubbo.pojo.Orders;

public interface IOrderService {

        public Orders getOrdersById(Integer orderId);

}
