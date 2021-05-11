package com.unige.urbantraffic.visualizer.manager;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication(scanBasePackages = "")
public class UrbanTrafficVisualizerManagerApp {

    public static void main(String[] args) {
        ThreadContext.put("cid", UUID.randomUUID().toString());
        SpringApplication.run(UrbanTrafficVisualizerManagerApp.class, args);
    }
}
