package com.example.websocketdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.websocketdemo.dao.Messages;

public interface LogsRepo extends JpaRepository<Messages, Integer> {

}
