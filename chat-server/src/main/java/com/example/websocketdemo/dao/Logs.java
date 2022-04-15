package com.example.websocketdemo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String eventtype;
    private String logmsg;
    private LocalDateTime timestmp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public String getLogmsg() {
        return logmsg;
    }

    public void setLogmsg(String logmsg) {
        this.logmsg = logmsg;
    }

    public LocalDateTime getTimestmp() {
        return timestmp;
    }

    public void setTimestmp(LocalDateTime timestmp) {
        this.timestmp = timestmp;
    }

    public Logs(String eventtype, String logmsg) {
        this.eventtype = eventtype;
        this.logmsg = logmsg;
    }

    

}

