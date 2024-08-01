package com.springtemplate.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtemplate.sakila.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Short>{
    
}
