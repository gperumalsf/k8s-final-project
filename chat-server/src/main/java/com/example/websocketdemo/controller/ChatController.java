package com.example.websocketdemo.controller;

import com.example.websocketdemo.dao.Logs;
import com.example.websocketdemo.dao.Messages;
import com.example.websocketdemo.model.ChatMessage;
import com.example.websocketdemo.repo.MessagesRepo;
import com.example.websocketdemo.repo.LogsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

/**
 * Created by rajeevkumarsingh on 24/07/17.
 */
@Controller
public class ChatController {
    @Autowired
    MessagesRepo messagesRepo;

    @Autowired
    LogsRepo LogsRepo;
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage)
    {
        Messages messages = new Messages();
        messages.setUsername(chatMessage.getSender());
        messages.setMsg(chatMessage.getContent());
        
        try{
        messagesRepo.save(messages);
        logsRepo.save(new Logs("INFO", messages.toString()));
        } catch(Exception e ){
            logsRepo.save(new Logs("ERROR", "error occurred while writing to the database"));
        }

        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        try{
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        LogsRepo.save(new Logs("INFO",chatMessage.getSender()));
    } catch(Exception e){
        LogsRepo.save(new Logs("ERROR","error occured while adding user"));
        }
        return chatMessage;
    }

}
