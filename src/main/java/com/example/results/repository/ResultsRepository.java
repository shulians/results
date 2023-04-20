package com.example.results.repository;

import com.example.results.model.Result;

import java.util.List;

public interface ResultsRepository {
    int save(Result result);

    List<Result> findAll();
}
