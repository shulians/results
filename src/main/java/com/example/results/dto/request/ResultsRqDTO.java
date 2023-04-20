package com.example.results.dto.request;

import com.example.results.dto.ResultsDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultsRqDTO {
    ResultsDTO result;
}
