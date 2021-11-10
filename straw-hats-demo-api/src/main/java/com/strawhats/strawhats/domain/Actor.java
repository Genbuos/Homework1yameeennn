package com.strawhats.strawhats.domain;

import javax.persistence.*;

@Entity // Table name in the DB
public class Actor {

    @Id //Primary Key in the Table
    @GeneratedValue(strategy = GenerationType.AUTO) // generate id's incrementally
    private Long id;

    private String heroes;

    private String actorName;



    public Actor() { }

    public Actor(Long id, String heroes, String actorName) {
        this.id = id;
        this.heroes = heroes;
        this.actorName = actorName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroes() {
        return heroes;
    }

    public void setHeroes(String heroes) {
        this.heroes = heroes;
    }

}
