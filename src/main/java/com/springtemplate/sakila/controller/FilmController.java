package com.springtemplate.sakila.controller;

import com.springtemplate.sakila.entity.Film;
import com.springtemplate.sakila.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/getFilms")
    public List<Film> getFilms() {
        return filmService.getAllFilms();
    }
}
