package com.springtemplate.sakila.service;

import com.springtemplate.sakila.entity.Film;
import com.springtemplate.sakila.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FilmService {

    public static final Logger logger = LoggerFactory.getLogger(FilmService.class);

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        logger.info("Running getAllFilms.");
        return filmRepository.findAll();
    }
}
