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
public class Order_Status {
    @Id
    String order_number;
    String rx;
    String status;
    String message;
}
