package com.tianshouzhi.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tianshouzhi on 2017/9/11.
 */
@RestController
@RequestMapping("/api")
public class ApiController {
	@PostMapping
	public ResponseEntity<?> create() {
		return ResponseEntity.ok().build();
	}

	@DeleteMapping
	public ResponseEntity<?> delete(Long id) {
		return ResponseEntity.ok().build();
	}

	@PutMapping
	public ResponseEntity<?> update() {
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<?> get() {
		return ResponseEntity.ok().build();
	}

	@GetMapping("/query")
	public ResponseEntity<?> query(Long id) {
		return ResponseEntity.ok().build();
	}
}
