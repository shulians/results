package com.example.results.repository;

import com.example.results.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcResultsRepository implements ResultsRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Result result) {
        return jdbcTemplate.update("insert into result (key_location, localizedName, country, dateTime," +
                                                            " weatherInMetric, weatherInImperial)" +
                                                            " values(?,?,?,?,?,?) ",
                result.getKey(), result.getLocalizedName(), result.getCountry(),
                result.getDateTime(),result.getWeatherInMetric(),result.getWeatherInImperial());
    }

    @Override
    public List<Result> findAll() {
        return jdbcTemplate.query("select * from result",
                (rs, rowNum) -> Result.builder()
                        .id(rs.getInt("id"))
                        .key(rs.getString("key_location"))
                        .localizedName(rs.getString("localizedName"))
                        .country(rs.getString("country"))
                        .DateTime(rs.getString("dateTime"))
                        .weatherInMetric(rs.getString("weatherInMetric"))
                        .weatherInImperial(rs.getString("weatherInImperial")).build()
        );
    }
}
