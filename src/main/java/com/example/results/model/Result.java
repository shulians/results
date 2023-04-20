package com.example.results.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result{
    Integer id;
    String key;
    String localizedName;
    String country;
    String DateTime;
    String weatherInMetric;
    String weatherInImperial;
}
