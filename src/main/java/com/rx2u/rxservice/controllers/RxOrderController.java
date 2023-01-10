package com.rx2u.rxservice.controllers;

import com.rx2u.rxservice.models.Customer;
import com.rx2u.rxservice.models.Order_Status;
import com.rx2u.rxservice.models.Rx_Order;
import com.rx2u.rxservice.services.RxOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class RxOrderController {

    @Autowired
    private RxOrderService rxOrderService;


    @PostMapping("/placeOrder")
    public Rx_Order placeOrder(@RequestBody Customer customer) {
        return rxOrderService.placeOrder(customer);
    }

    @DeleteMapping("/deleteOrder/{orderNumber}")
    public void deleteOrder(@PathVariable String orderNumber) {
        rxOrderService.deleteOrder(orderNumber);
    }
}
