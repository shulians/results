package com.example.results.dto;

import com.example.results.model.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultsDTO {
    String key;
    String localizedName;
    String country;
    String DateTime;
    String weatherInMetric;
    String weatherInImperial;

    public static ResultsDTO convert (Result toConvert){
        ModelMapper modelMapper = new ModelMapper();

        ResultsDTO dto = modelMapper.map(toConvert,ResultsDTO.class);

        return dto;
    }
}
