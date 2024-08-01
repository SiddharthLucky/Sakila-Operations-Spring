package com.springtemplate.sakila.entity;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
public class Actor {
    @Id
    @Column(name = "actor_id", nullable = false)
    private Short id;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

     //@JsonIgnore
    @JsonBackReference
    @ManyToMany(mappedBy = "actorsList")
    @Fetch(FetchMode.JOIN)
    private Set<Film> filmsSet = new HashSet<>();
}
