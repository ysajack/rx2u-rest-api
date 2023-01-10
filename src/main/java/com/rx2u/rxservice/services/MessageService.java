package com.rx2u.rxservice.services;

import com.rx2u.rxservice.models.Message;
import com.rx2u.rxservice.respositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        List<Message> ls = new ArrayList<>();
        Iterable<Message> messages = messageRepository.findAll();
        messages.forEach(ls::add);
        return ls;
    }

    public Message putMessage(Message message) {
       return messageRepository.findById(message.getStatus()).map(msgObj -> {
            msgObj.setMessage(message.getMessage());
            return messageRepository.save(msgObj);
        }).orElseGet(() -> messageRepository.save(message));
    }
}
