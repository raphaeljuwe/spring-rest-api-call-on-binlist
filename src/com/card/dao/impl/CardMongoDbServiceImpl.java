package com.card.dao.impl;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.dao.CardMongoDbDTO;
import com.card.dao.CardMongoDbService;
import com.card.model.Card;
import com.card.repository.CardRepository;
import com.card.exception.EntityNotFoundException;

@Service
public class CardMongoDbServiceImpl implements CardMongoDbService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public CardMongoDbDTO addCard(CardMongoDbDTO cardDTO) {
       
        Card card = new Card();
        card.setPayload(cardDTO.getPayload());
        card.setSize(cardDTO.getSize());
        card.setStart(cardDTO.getStart());
        card.setSuccess(cardDTO.getSuccess());
        cardRepository.save(card);

        /* set generated user id to response object */
        cardDTO.setId(card.getId());
        
        return cardDTO;
    }

    @Override
    public CardMongoDbDTO getCard(String id) {
        Card card = cardRepository.findOne(id);
        if (Objects.isNull(card)) {
            /* handle this exception using {@link RestExceptionHandler} */
            throw new EntityNotFoundException(Card.class, id);
        }
        return new CardMongoDbDTO().build(card);
    }

    @Override
    public CardMongoDbDTO updateCard(CardUpdateDTO cardUpdateDTO, String id) {
        Card card = cardRepository.findOne(id);
        if (Objects.isNull(card)) {
            /* handle this exception using {@link RestExceptionHandler} */
            throw new EntityNotFoundException(Card.class, id);
        }
        
		card.setSuccess(cardUpdateDTO.getSuccess());
        card.setPayload(cardUpdateDTO.getPayload());
		cardRepository.save(card);		
        return new CardMongoDbDTO().build(card);
    }

    @Override
    public void deleteCard(String id) {
        cardRepository.delete(id);
    }
}
