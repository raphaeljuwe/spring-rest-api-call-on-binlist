
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CardUpdateDTO {
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

}