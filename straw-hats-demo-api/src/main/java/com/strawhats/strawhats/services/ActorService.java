package com.strawhats.strawhats.services;

import com.strawhats.strawhats.domain.Actor;
import com.strawhats.strawhats.repositories.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepo actorRepo;

    public List<Actor> getVoiceCastList(){
        //Create A list
        List<Actor> actorList = new ArrayList<>();
        //get all the actors in a db
    actorRepo.findAll()
            .forEach(actorList:: add);
        return actorList;
    }

    //add a an Actor
    public void addVoiceCast(Actor actor){
        actorRepo.save(actor);
    }


    //TODO: Update an Actor
    public void editVoiceCast(Actor actor,  Long id ){
        actorRepo.save(actor);
    }

    //TODO: delete an Actor
    public void deleteVoiceCast(Long id){
    boolean exists = actorRepo.existsById(id);
    if(!exists){
        throw new IllegalStateException(
                "actor with id '" + id + "' does not exist"
        );
    }

    actorRepo.deleteById(id);
    }

    //TODO: get a single Actor
    public Actor getSingleVoiceCast(Long id){
//        for (Actor a: actorRepo.findAll()) {
//
//            if (a.getId().equals(a)){
//                throw new IllegalStateException(
//                        "actor with id '" + id + "' does not exist"
//                );
//            }
//
//        }



        return actorRepo.findById(id).orElseThrow(null);
    }






/*
Notes

    Business Logic - where services talk to controllers and repos to bring things together

    //C.R.U.D
    //Read - GET
    //Get all the actors
 */



}
