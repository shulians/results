package com.example.results.service.impl;

import com.example.results.dto.ResultsDTO;
import com.example.results.dto.request.ResultsRqDTO;
import com.example.results.dto.response.ResultsRsDTO;
import com.example.results.model.Result;
import com.example.results.repository.ResultsRepository;
import com.example.results.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements IResultService {
    @Autowired
    private ResultsRepository repository;

    @Override
    public ResultsRsDTO getAll() {
        ResultsRsDTO rs = ResultsRsDTO.builder().build();

        List<Result> results = repository.findAll();

        if(!results.isEmpty()) {
            rs = ResultsRsDTO.convert(results);
        }

        return rs;
    }

    @Override
    public void create(ResultsDTO resultsDTO) {
        Result result = Result.builder()
                              .key(resultsDTO.getKey())
                              .localizedName(resultsDTO.getLocalizedName())
                              .country(resultsDTO.getCountry())
                              .DateTime(resultsDTO.getDateTime())
                              .weatherInMetric(resultsDTO.getWeatherInMetric())
                              .weatherInImperial(resultsDTO.getWeatherInImperial()).build();

        repository.save(result);
    }
}
