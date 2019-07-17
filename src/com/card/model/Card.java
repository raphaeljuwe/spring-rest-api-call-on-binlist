package com.card.model;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Card implements Serializable {
	
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
	private Boolean  success;
	private Map<?,?> payload;
	private Integer start;
	private Integer limit;
	private Integer size;
	
 public Card () {
	 
 }

	public Card(String id,Boolean success, Map<?,?> payload, Integer start,Integer limit,Integer size) {
		this.success =  success;
		this.payload = payload;
		this.start = start;
		this.limit = limit;
		this.size = size;
		this.id = id;
		
	}

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
	
	
	
}
