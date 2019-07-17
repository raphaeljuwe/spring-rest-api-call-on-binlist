package com.card.dao;

import java.util.List;
import java.util.Map;

import com.card.model.Card;

public interface CardService  {


    CardUpdateDTO create(CardUpdateDTO card);
 
    CardUpdateDTO delete(String id,Boolean success, Map<?,?> payload, Integer start,Integer limit,Integer size);
 
    List<CardUpdateDTO> findAll();
 
    CardUpdateDTO findById(String id);
 
    CardUpdateDTO update(CardUpdateDTO card);
}


