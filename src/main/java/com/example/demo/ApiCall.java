package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCall {

    private static final Logger log = LoggerFactory.getLogger(ApiCall.class);

    @GetMapping("/fetch-data")
    public String fetchData() {
        // Simulate fetching data from an external API
        log.info("Fetching data from external API");
        return "Data from external API";
    }
}
