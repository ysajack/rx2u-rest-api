package com.rx2u.rxservice.respositories;

import com.rx2u.rxservice.models.Order_Status;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderStatusRepository extends CrudRepository<Order_Status, String> {
    @Query(value="select o.order_number, o.rx, o.status, m.message from Rx_Order o, " +
    "Message m, Customer c where o.status=m.status and c.customer_phone=o.customer_phone", nativeQuery = true)
    List<Order_Status> findAllOrderStatus();

    @Query(value="select o.order_number, o.rx, o.status, m.message from Rx_Order o, " +
            "Message m, Customer c where (o.status=m.status and c.customer_phone=o.customer_phone) and o.order_number=?1", nativeQuery = true)
    Order_Status findOrderStatus(String order_number);
}
