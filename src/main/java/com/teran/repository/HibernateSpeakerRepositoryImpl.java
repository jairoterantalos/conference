package com.teran.repository;

import com.teran.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Jairo");
        speaker.setLastName("Teran");
        speakers.add(speaker);

        return speakers;
    }
}
