package com.card.dao;

public interface CardMongoDbService {


	    public CardMongoDbDTO addCard(CardMongoDbDTO cardDTO);
	    public CardMongoDbDTO getCard(String id);
	    public CardMongoDbDTO updateCard(CardUpdateDTO cardUpdateDTO, String id);
	    public void deleteCard(String id);

}
