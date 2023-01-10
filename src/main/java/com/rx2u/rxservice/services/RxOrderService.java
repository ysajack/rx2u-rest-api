package com.rx2u.rxservice.services;

import com.rx2u.rxservice.exceptions.OrderNotFoundException;
import com.rx2u.rxservice.models.Customer;
import com.rx2u.rxservice.models.Rx_Order;
import com.rx2u.rxservice.respositories.CustomerRepository;
import com.rx2u.rxservice.respositories.RxOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class RxOrderService {

    @Autowired
    RxOrderRepository rxOrderRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Rx_Order placeOrder(Customer customer) {
        String orderNumber = RandomStringUtils.randomAlphanumeric(6);
        String orderDate = new SimpleDateFormat("MM/dd/yy").format(new Date());
        Rx_Order rxORder = new Rx_Order(orderNumber.toLowerCase(), customer.getRx(), customer.getCustomer_phone(), "New", orderDate);

        customerRepository.save(customer);
        return rxOrderRepository.save(rxORder);
    }

    public Rx_Order findRxOrder(String orderNumber) {
        return rxOrderRepository.findById(orderNumber).orElseThrow(() -> new OrderNotFoundException(orderNumber));
    }

    public void deleteOrder(String orderNumber) {
        rxOrderRepository.deleteById(findRxOrder(orderNumber).getOrder_number());
    }

}
