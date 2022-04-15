package com.example.websocketdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.websocketdemo.dao.Logs;

public interface LogsRepo extends JpaRepository<Logs, Integer> {

}
