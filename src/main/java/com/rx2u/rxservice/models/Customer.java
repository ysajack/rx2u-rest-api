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
public class Customer {
    @Id
    String customer_phone;
    String last;
    String first;
    String dob;
    String address;
    String pharmacy;
    String rx;
    String username;
    String password;
}
