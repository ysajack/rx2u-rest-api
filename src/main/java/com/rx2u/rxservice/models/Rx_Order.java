package com.rx2u.rxservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rx_Order {
    @Id
    String order_number;
    String rx;
    String customer_phone;
    String status;
    String order_date;
}
