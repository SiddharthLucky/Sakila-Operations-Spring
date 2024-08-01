package com.springtemplate.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtemplate.sakila.entity.Actor;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Short>{
    
}
