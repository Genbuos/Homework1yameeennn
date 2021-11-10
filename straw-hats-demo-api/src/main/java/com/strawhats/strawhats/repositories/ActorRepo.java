package com.strawhats.strawhats.repositories;

import com.strawhats.strawhats.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Repository talks to DB
@Repository
public interface ActorRepo extends JpaRepository<Actor,Long > {

}
