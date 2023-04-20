package com.example.results.dto.response;

import com.example.results.dto.ResultsDTO;
import com.example.results.model.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultsRsDTO {
    List<ResultsDTO> results;

    public static ResultsRsDTO convert (List<Result> toConvert){
        List<ResultsDTO> list = new ArrayList<>();

        for (Result item:toConvert) {
            list.add(ResultsDTO.convert(item));
        }

        return ResultsRsDTO.builder().results(list).build();
    }
}
