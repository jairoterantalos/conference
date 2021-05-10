package com.teran;

import com.teran.repository.HibernateSpeakerRepositoryImpl;
import com.teran.repository.SpeakerRepository;
import com.teran.service.SpeakerService;
import com.teran.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
