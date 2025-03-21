package com.example.jenkins_test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/test")
//public class TestController {
//    @GetMapping("/ex")
//    public ResponseEntity<String> ex() {
//        return ResponseEntity.ok("jenkins_test ex05 blue success");
//    }
//}

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/ex")
    public ResponseEntity<String> ex() {
        return ResponseEntity.ok("jenkins_test ex06 green success");
    }
}