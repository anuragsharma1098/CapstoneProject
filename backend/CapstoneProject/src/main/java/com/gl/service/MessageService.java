package com.gl.service;

import com.gl.model.Message;
import com.gl.repository.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repo;

    public void saveMessage(Message m) {
        repo.save(m);
    }

    public void updateMessage(Message m) {
        repo.save(m);
    }

    public void saveAll(List<Message> messages) {
        repo.saveAll(messages);
    }

    public List<Message> getAllMessages() {
        return repo.findAll();
    }

    public List<Message> getByFromAndTo(String from, String to) {
        return repo.findByFromUserAndToUser(from, to);
    }
}
