package com.example.websocketdemo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Logs {

    private String eventType;
    private String logMsg;

    private LocalDateTime timestmp;

    public LocalDateTime getTimestmp() {
        return timestmp;
    }
    public void setTimestmp(LocalDateTime timestmp) {
        this.timestmp = timestmp;
    }
    public String getLogMsg() {
        return logMsg;
    }
    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }
    public String getEventType() {
        return logMsg;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public Logs(String eventType, String logMsg) {
        this.eventType = eventType;
        this.logMsg = logMsg;
    }

    

}

