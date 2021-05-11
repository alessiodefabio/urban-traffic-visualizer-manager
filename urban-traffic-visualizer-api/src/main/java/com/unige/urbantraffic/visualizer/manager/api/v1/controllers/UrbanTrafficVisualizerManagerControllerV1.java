package com.unige.urbantraffic.visualizer.manager.api.v1.controllers;

import com.unige.urbantraffic.visualizer.manager.api.v1.interfaces.UrbanTrafficVisualizerManagerApiV1;
import com.unige.urbantraffic.visualizer.manager.model.v1.Simulation;
import com.unige.urbantraffic.visualizer.manager.service.interfaces.UrbanTrafficVisualizerManagerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Api
@SuppressWarnings({ "rawtypes", "unchecked" })
@RestController
@CrossOrigin
public class UrbanTrafficVisualizerManagerControllerV1 implements UrbanTrafficVisualizerManagerApiV1 {

    @Autowired UrbanTrafficVisualizerManagerService urbanTrafficVisualizerManagerService;

    @Override
    public ResponseEntity<Simulation> renderSimulation(MultipartFile domain, MultipartFile initialConditions, MultipartFile simulationOutput) throws IOException {
        logReceivedInputInfo(domain, initialConditions, simulationOutput);
//        InputStream domainStream = domain.getInputStream();
//        InputStream initialConditionsStream = initialConditions.getInputStream();
//        InputStream simulationOutputStream = simulationOutput.getInputStream();
        String domainString = new String(domain.getBytes(), StandardCharsets.UTF_8);
        String initialConditionsString = new String(initialConditions.getBytes(), StandardCharsets.UTF_8);
        String simulationOutputString = new String(simulationOutput.getBytes(), StandardCharsets.UTF_8);
        Simulation simulation = urbanTrafficVisualizerManagerService.getSimulation(domainString, initialConditionsString, simulationOutputString);
        return new ResponseEntity<>(simulation, HttpStatus.OK);
    }

    private void logReceivedInputInfo(MultipartFile domain, MultipartFile initialConditions, MultipartFile simulationOutput){
        log.info("Received a request for a new simulation");
        log.info("Input files received: domain [{}] | initialConditions [{}] | simulationOutput [{}]", domain.getOriginalFilename(), initialConditions.getOriginalFilename(), simulationOutput.getOriginalFilename());
        log.debug("Domain file infos: {}", domain.getSize());
        log.debug("Initial conditions file infos: {}", initialConditions.getSize());
        log.debug("Simulation Output file infos: {}", simulationOutput.getSize());
    }


}
