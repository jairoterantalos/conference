package com.teran.service;

import com.teran.model.Speaker;
import com.teran.repository.HibernateSpeakerRepositoryImpl;
import com.teran.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {

        System.out.println("speakerServiceImpl repository constructor");
        this.repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
