package com.strawhats.strawhats.controllers;

import com.strawhats.strawhats.domain.Actor;
import com.strawhats.strawhats.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cast")
public class ActorController {

    //create an endpoint - http://
    //dependency inject
    @Autowired
    private ActorService voiceCastService;

    @GetMapping
    public List<Actor> getCasts(){
        return voiceCastService.getVoiceCastList();
    }

    //Controller

    @PostMapping
    public void registerVoiceCast(@RequestBody Actor actor ){
        voiceCastService.addVoiceCast(actor);
    }

    //Edit
    @PutMapping("/{id}")
    public void updateActor(@RequestBody Actor actor,  @PathVariable Long id){
        voiceCastService.editVoiceCast(actor, id);
    }

    @DeleteMapping("/{id}")
    public void deleteVoiceCastMember( @PathVariable Long id){
        voiceCastService.deleteVoiceCast(id);
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id){
        return voiceCastService.getSingleVoiceCast(id);
    }


}
