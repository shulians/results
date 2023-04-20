package com.example.results.controller;

import com.example.results.dto.ResultsDTO;
import com.example.results.dto.request.ResultsRqDTO;
import com.example.results.dto.response.ResultsRsDTO;
import com.example.results.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/results")
public class ResultsController {
    private IResultService service;

    @Autowired
    public ResultsController(IResultService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ResultsRsDTO> getAll() {
        return ResponseEntity.ok(this.service.getAll());
    }

    @PostMapping
    public void create(@RequestBody ResultsDTO result) {
        this.service.create(result);
    }


}
