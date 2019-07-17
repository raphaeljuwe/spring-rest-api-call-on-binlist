package com.card.dao;

import java.util.Map;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.card.model.Card;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)

public class CardMongoDbDTO {

    /* used to send database id */
    private String id;
    
    @JsonProperty("success")
    private Boolean  success;

    @JsonProperty("payload")
    private Map<?,?> payload;
	
	@JsonProperty("start")
    private Integer start;
	
	@JsonProperty("limit")
    private Integer limit;
	
	@JsonProperty("size")
    private Integer size;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public Map<?,?> getPayload() {
		return payload;
	}

	public void setPayload(Map<?,?> payload) {
		this.payload = payload;
	}
	
	
	public String getId() {
		return id;
	}
	

	public void setId (String id) {
	    this.id = id;	
	}

	
	public Integer getStart() {
		return start;
	}
	

	public void setStart (int start) {
	    this.start = start;	
	}
	
	public Integer getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size; 
	}
	
	
	public Integer getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit; 
	}
	
   
   
    public CardMongoDbDTO build(Card card) {        
        this.success =  card.getSuccess();
		this.payload = card.getPayload();
		this.start = card.getStart();
		this.limit = card.getLimit();
		this.size = card.getSize();
		this.id = card.getId();
        
        return this;
    }
}