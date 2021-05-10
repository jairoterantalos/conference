package com.teran.service;

import com.teran.model.Speaker;
import com.teran.repository.HibernateSpeakerRepositoryImpl;
import com.teran.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
