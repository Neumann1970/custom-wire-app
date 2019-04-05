package com.wire.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wire.component.SomeComponent;

@RestController
public class MessageController {
	
	  @Autowired
	  SomeComponent someComponent;
	  
	  @RequestMapping(value="/message", method=RequestMethod.GET)
	  public ResponseEntity<String> getCart() {  

		  	String caller = "From Custom Autowired";
		    String greeting = someComponent.sayHello(caller);
			return new ResponseEntity<>(greeting, HttpStatus.OK);
		}

}
