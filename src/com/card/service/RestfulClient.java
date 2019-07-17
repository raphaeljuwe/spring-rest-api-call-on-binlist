package com.card.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.card.model.Card;

public class RestfulClient {
	RestTemplate restTemplate;
	
	public RestfulClient(){
		restTemplate = new RestTemplate();
	}
	
    	
	/**
	 * get entity
	 */
	public void getCardEntity(){
		System.out.println("Begin /GET request!");
		String getUrl = "https://binlist.net/card-scheme/verify/234564562";
		ResponseEntity<Card> getResponse = restTemplate.getForEntity(getUrl, Card.class);
		if(getResponse.getBody() != null){
			System.out.println("Response for Get Request: " + getResponse.getBody().toString());	
		}else{
			System.out.println("Response for Get Request: NULL");
		}
	}
	
	
	
	/**
	 * get entity
	 */
	public void getEntity(){
		System.out.println("Begin /GET request!");
		String getUrl = "https://binlist.net/card-scheme/stats?start=1&limit=3";
		ResponseEntity<Card> getResponse = restTemplate.getForEntity(getUrl, Card.class);
		if(getResponse.getBody() != null){
			System.out.println("Response for Get Request: " + getResponse.getBody().toString());	
		}else{
			System.out.println("Response for Get Request: NULL");
		}
	}
	
	
	
	
}
