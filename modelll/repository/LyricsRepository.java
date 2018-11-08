package com.example.projectforrft.repository;

import com.example.projectforrft.domain.Lyrics;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LyricsRepository extends CrudRepository<Lyrics, Long> {

    /**
     * Vissza adja az összes dalszöveget egy listában,
     * ezt tudjuk rendezni a szerint amire van igény.
     * */
    List<Lyrics> findAll();
}
