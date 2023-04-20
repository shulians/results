package com.example.results.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseInitializer {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    CommandLineRunner loadDatabase() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                jdbcTemplate.execute("create table result (id int primary key "
                        + "auto_increment, key_location varchar(30), localizedName varchar(30),"
                        + "country varchar(30),city varchar(30), dateTime varchar(40),"
                        + "weatherInMetric varchar(30), weatherInImperial varchar(30))");
            }
        };
    }
}
