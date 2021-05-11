package com.teran;

import com.teran.repository.HibernateSpeakerRepositoryImpl;
import com.teran.repository.SpeakerRepository;
import com.teran.service.SpeakerService;
import com.teran.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.teran"})
public class AppConfig {

   /* @Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/

}
