package com.springtemplate.sakila.service;

import com.springtemplate.sakila.entity.Film;
import com.springtemplate.sakila.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

}
