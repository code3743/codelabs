package com.example.virtualthreads_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class DemoController {

    @GetMapping("/slow")
    public ResponseEntity<String> slowEndpoint() throws InterruptedException {
       
        log.info("Executing in thread: {}", Thread.currentThread());
        
        Thread.sleep(2000); 
        return ResponseEntity.ok("Processed in thread: " + Thread.currentThread().getName());
    }
}