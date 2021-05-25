package com.unige.urbantraffic.visualizer.manager.service;

import com.hstairs.ppmajal.domain.PddlDomain;
import com.hstairs.ppmajal.problem.EPddlProblem;
import com.unige.urbantraffic.visualizer.manager.model.v1.Simulation;
import com.unige.urbantraffic.visualizer.manager.service.interfaces.UrbanTrafficVisualizerManagerService;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import planners.ENHSP;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.LogManager;

@Service
public class UrbanTrafficVisualizerManagerServiceImpl implements UrbanTrafficVisualizerManagerService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Simulation getSimulation(String domain, String initialConditions, String simulationOutput) {
        ENHSP p = new ENHSP(false);
        Path domainPath = Paths.get("domain");
        Path initPath = Paths.get("initial");
        Path outputPath = Paths.get("output");
        try {
            Files.write(domainPath, domain.getBytes(StandardCharsets.UTF_8));
            Files.write(initPath, domain.getBytes(StandardCharsets.UTF_8));
            Files.write(outputPath, domain.getBytes(StandardCharsets.UTF_8));
        }catch (Exception e){
            log.error("Unable to create temp file: {}", e);
        }

        Pair<PddlDomain, EPddlProblem> parsedDomain = p.parseDomainProblem(domainPath.getFileName().toString(), initPath.getFileName().toString(), Integer.toString(10), getPrintStream());
        EPddlProblem problem = parsedDomain.getRight();

        try {
            Files.delete(domainPath);
            Files.delete(initPath);
            Files.delete(outputPath);
        } catch (IOException e) {
            log.error("Unable to delete temp file: {}", e);
        }

        return null;
    }

    private PrintStream getPrintStream(){
        return new PrintStream(new OutputStream() {
            public void write(int b) {
            }
        });
    }
}
