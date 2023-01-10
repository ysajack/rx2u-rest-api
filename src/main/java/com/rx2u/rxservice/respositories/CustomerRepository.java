package com.rx2u.rxservice.respositories;

import com.rx2u.rxservice.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
