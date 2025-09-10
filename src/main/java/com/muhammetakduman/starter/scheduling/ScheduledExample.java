package com.muhammetakduman.starter.scheduling;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
    @Scheduled(cron = "0/5 * * * * *")
    private void arttirma(){
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
