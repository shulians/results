package com.example.results.service;

import com.example.results.dto.ResultsDTO;
import com.example.results.dto.response.ResultsRsDTO;

public interface IResultService {
    ResultsRsDTO getAll();

    void create(ResultsDTO rq);
}
