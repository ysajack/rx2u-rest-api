package com.rx2u.rxservice.services;

import com.rx2u.rxservice.exceptions.OrderNotFoundException;
import com.rx2u.rxservice.models.Message;
import com.rx2u.rxservice.models.Order_Status;
import com.rx2u.rxservice.models.Rx_Order;
import com.rx2u.rxservice.respositories.MessageRepository;
import com.rx2u.rxservice.respositories.OrderStatusRepository;
import com.rx2u.rxservice.respositories.RxOrderRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStatusService {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    private RxOrderRepository rxOrderRepository;

    @Autowired
    RxOrderService rxOrderService;

    @Autowired
    MessageService messageService;

    public List<Order_Status> getAllOrderStatus() {
        return orderStatusRepository.findAllOrderStatus();
    }

    public Order_Status checkOrderStatus(String orderNumber) {
        Rx_Order rxOrder = rxOrderService.findRxOrder(orderNumber);
        return orderStatusRepository.findOrderStatus(rxOrder.getOrder_number());
    }

    public Order_Status updateOrder(Order_Status orderStatus, String orderNumber) {
        Integer id = Integer.parseInt(RandomStringUtils.randomNumeric(2));
        String rx = orderStatus.getRx();
        String stat = orderStatus.getStatus();
        String msg = orderStatus.getMessage();
        Rx_Order rxOrder = rxOrderService.findRxOrder(orderNumber);

        //Update RxOrder table
        rxOrder.setRx(rx);
        rxOrder.setStatus(stat);
        rxOrderRepository.save(rxOrder);

        //Update Message table
        Message message = new Message(stat, msg);
        messageService.putMessage(message);

        //Just echo back the input object
        return orderStatus;
    }
}
