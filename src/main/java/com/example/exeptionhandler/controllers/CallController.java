package com.example.exeptionhandler.controllers;

import com.example.exeptionhandler.model.Call;
import com.example.exeptionhandler.services.CallService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calls")
@AllArgsConstructor
public class CallController {

    private CallService callService;

    @GetMapping("{id}")
    public ResponseEntity<Call> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(callService.findById(id));
    }
}
