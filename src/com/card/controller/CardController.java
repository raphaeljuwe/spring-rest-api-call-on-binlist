package com.card.controller;


import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.card.dao.CardUpdateDTO;
import com.card.dao.CardService;
import com.card.model.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Handles requests for the Card service.
 */
@RestController
@RequestMapping("/api/card")
final class CardController {
 
    private final CardService service;
 
    private static final Logger logger = LoggerFactory.getLogger(CardController.class);
    
    @Autowired
    CardController(CardService service) {
        this.service = service;
    }
 
    
    
    @RequestMapping(method=RequestMethod.GET, value="https://binlist.net/card-scheme/verify/234564562")
    List<CardUpdateDTO> findAll() {
        return service.findAll();
    }
 
    @RequestMapping(method=RequestMethod.GET, value="https://binlist.net/card-scheme/stats?start=1&limit=3")
    CardUpdateDTO findById(@PathVariable("id") String id) {
        return service.findById(id);
    }
 
 
   
}