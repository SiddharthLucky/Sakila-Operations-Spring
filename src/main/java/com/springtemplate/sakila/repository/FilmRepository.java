package com.springtemplate.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtemplate.sakila.entity.Film;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Short>{
    
}
