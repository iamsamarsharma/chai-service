package com.spring.mssg.chaiservice.web.controller;


import com.spring.mssg.chaiservice.web.model.ChaiDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/chai")
public class ChaiController {

    @GetMapping("/{chaiId}")
    public ResponseEntity<ChaiDto> getChaiById(@PathVariable("chaiId") UUID id, @PathVariable String chaiId) {
        return new ResponseEntity<>(ChaiDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveChai(@RequestBody @Validated ChaiDto chaiDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{chaiId}")
    public ResponseEntity updateChaiById(@PathVariable("chaiId") UUID chaiId, @ Validated @RequestBody ChaiDto chaiDto) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

