package com.springtemplate.sakila.controller;

import com.springtemplate.sakila.entity.Film;
import com.springtemplate.sakila.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/actors")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping("/{firstName},{lastName}")
    public Set<Film> getAllActors(@PathVariable String firstName, @PathVariable String lastName) {
        return actorService.getFilmsByActorsNames(firstName, lastName);
    }
}
