package com.amarnath.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EDIController {
	
	@GetMapping("hello")
	public ResponseEntity<String> reprocessPO() {

			return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		}
	}

	

}
