package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/getName")
	public ResponseEntity<String> getName(
		@RequestParam(name = "id", required = true) String id
	) {
		String dummyName = "John Doe";
		return ResponseEntity.ok(dummyName);
	}

}
