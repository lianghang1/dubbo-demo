package org.dubbo;

import org.dubbo.pojo.Orders;
import org.dubbo.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-user.xml"});
        context.start();
        IOrderService orderService = (IOrderService) context.getBean("orderService");
        Orders orders = orderService.getOrdersById(20180702);
        System.out.println(orders);
    }
}