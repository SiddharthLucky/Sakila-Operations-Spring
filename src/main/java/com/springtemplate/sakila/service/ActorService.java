package com.springtemplate.sakila.service;

import com.springtemplate.sakila.entity.Actor;
import com.springtemplate.sakila.entity.Film;
import com.springtemplate.sakila.repository.ActorRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
@Slf4j
public class ActorService {

    private static final Logger logger = LoggerFactory.getLogger(ActorService.class);

    @Autowired
    private ActorRepository actorRepository;

    public Set<Film> getFilmsByActorsNames(String firstName, String lastName) {
        logger.info("Running get Films by actors name.");
        Optional<Actor> actor = Optional.of(actorRepository.findByFirstNameAndLastName(firstName, lastName));
        return actor.get().getFilmsSet();
    }

}
