package com.card.repository;

import com.card.model.*;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends  MongoRepository<Card, String> {
	
	
	Card findOne(Integer id);

    @Override
    void delete(Card deleted);
    
    List<Card> findAll();
    
    Optional<Card> findOne(String id);
 
    Card save(Card saved);
    
  

}
