package com.rx2u.rxservice.controllers;

import com.rx2u.rxservice.models.Order_Status;
import com.rx2u.rxservice.models.Rx_Order;
import com.rx2u.rxservice.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class OrderStatusController {

    @Autowired
    OrderStatusService orderStatusService;

    @GetMapping("/checkAllOrderStatus")
    public List<Order_Status> checkAllOrderStatus() {
        return orderStatusService.getAllOrderStatus();
    }

    @GetMapping("/checkOrderStatus/{orderNumber}")
    public Order_Status checkOrderStatus(@PathVariable String orderNumber) {
        return orderStatusService.checkOrderStatus(orderNumber);
    }

    @PutMapping("/updateOrder/{orderNumber}")
    public Order_Status updateOrder(@RequestBody Order_Status status, @PathVariable String orderNumber) {
        return orderStatusService.updateOrder(status, orderNumber);
    }
}
