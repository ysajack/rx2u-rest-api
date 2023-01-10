package com.rx2u.rxservice.respositories;

import com.rx2u.rxservice.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, String> {
}
