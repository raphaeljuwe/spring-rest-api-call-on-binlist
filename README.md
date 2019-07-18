# spring-rest-api-call-on-binlist
A simple Spring REST api service that will call on binlist (https://binlist.net/)




## Spring REST api service

 Create a simple Spring REST api service that will
understand the following call and response structure:   
    
	 
     GET /card-scheme/verify/234564562....
     {
       "success": true
       "payload" : {
            "scheme": "visa",
            "type" : "debit",
            "bank" : "UBS"
     }    
    }
    # Number of hits
    GET /card-scheme/stats?start=1&limit=3
    {
      "success": true
      "start": 1,
      "limit": 3,
      "size": 133,
      "payload": {
        "545423": 5,
        "679234": 4,
        "329802": 1
      }
    }
	
	
	#### Topics to taked in account
- OOP with MVC design pattern 
- Database modelization, using JPA or ORM : MongoDB
- Maven
- Code standards/clean code
- Software patterns
- Performance and number of requests to the 3rd Party API
- Unit tests : Junit testing    
- Create a simple UI for the endpoints and display the output properly : Swagger Integration
