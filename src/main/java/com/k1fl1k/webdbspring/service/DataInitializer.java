package com.k1fl1k.webdbspring.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class DataInitializer {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // This method will be called after the Spring context is initialized
    @PostConstruct
    public void init() {
        runSqlScript();
    }

    private void runSqlScript() {
        try {
            // Load the data.sql file from the resources folder
            File scriptFile = ResourceUtils.getFile("classpath:Data/data.sql");

            // Read all lines from the script file
            try (Stream<String> stream = Files.lines(Paths.get(scriptFile.toURI()))) {
                // Execute each SQL statement line by line
                stream.forEach(sql -> jdbcTemplate.execute(sql));
            }

            System.out.println("SQL script executed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to execute SQL script: " + e.getMessage());
        }
    }
}
