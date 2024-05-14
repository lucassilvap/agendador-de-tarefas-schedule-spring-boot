package com.example.agendadordetarefasschedulespringboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduleService {

    @Scheduled(fixedDelay = 2500)
    public void execute(){
          System.out.println(LocalDateTime.now());
    }

}
