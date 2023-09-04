package com.example.exeptionhandler.config;

import com.example.exeptionhandler.model.Call;
import com.example.exeptionhandler.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@Configuration
public class DBSeed {

    @Autowired
    CallRepository repo;

    @Bean
    public void dbInitialize() {

        Call fire = Call.builder()
                .date(LocalDate.now())
                .time(LocalTime.now())
                .requester("Dom João VI")
                .description("A focus of fire was reported nearby the Main Street.")
                .build();

        Call flood = Call.builder()
                .date(LocalDate.now())
                .time(LocalTime.now())
                .requester("Dom Pedro I")
                .description("Due to the rain, citizen is afraid of flooding on his neighborhood.")
                .build();

        Call earthquake = Call.builder()
                .date(LocalDate.now())
                .time(LocalTime.now())
                .requester("Princesa Isabel")
                .description("Earthquake was noticed on requester home/")
                .build();


        repo.saveAll(Arrays.asList(fire, flood, earthquake));
    }
}
