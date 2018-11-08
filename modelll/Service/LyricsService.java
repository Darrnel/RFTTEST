package com.example.projectforrft.Service;

import com.example.projectforrft.repository.LyricsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LyricsService{

    private LyricsRepository lyricsRepository;

    @Autowired
    public void setLyricsRepository(LyricsRepository lyricsRepository){
        this.lyricsRepository = lyricsRepository;
    }

}
