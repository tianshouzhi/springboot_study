package com.tianshouzhi.springboot.controller;

import com.codahale.metrics.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tianshouzhi on 2017/9/11.
 */
@RestController
@RequestMapping("/api")
public class ApiController {
	@PostMapping
	@Timed
	public ResponseEntity<?> create() {
		return ResponseEntity.ok().build();
	}

	@DeleteMapping
	@Timed
	public ResponseEntity<?> delete(Long id) {
		return ResponseEntity.ok().build();
	}

	@PutMapping
	@Timed
	public ResponseEntity<?> update() {
		return ResponseEntity.ok().build();
	}

	@GetMapping
	@Timed
	public ResponseEntity<?> get() {
		return ResponseEntity.ok().build();
	}

	@GetMapping("/query")
	public ResponseEntity<?> query(Long id) {
		return ResponseEntity.ok().build();
	}
}
