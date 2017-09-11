package com.tianshouzhi.springboot.web.api;

import com.tianshouzhi.springboot.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tianshouzhi on 2017/9/11.
 */
@RestController
@RequestMapping("/user")
public class UserApiController {
    @PostMapping
    public ResponseEntity<?> create(User user) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id) {
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> update(User user) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> get(Long id) {
        User user=new User();
        user.setId(id);
        user.setName("user"+id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/query")
    public ResponseEntity<?> query(Long id) {
        User user=new User();
        user.setId(id);
        user.setName("user"+id);
        return ResponseEntity.ok().body(user);
    }
}
