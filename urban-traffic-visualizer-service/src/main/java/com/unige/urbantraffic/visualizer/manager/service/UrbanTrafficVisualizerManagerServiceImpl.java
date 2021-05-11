package com.unige.urbantraffic.visualizer.manager.service;

import com.unige.urbantraffic.visualizer.manager.model.v1.Simulation;
import com.unige.urbantraffic.visualizer.manager.service.interfaces.UrbanTrafficVisualizerManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import planners.ENHSP;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.LogManager;

@Service
public class UrbanTrafficVisualizerManagerServiceImpl implements UrbanTrafficVisualizerManagerService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Simulation getSimulation(String domain, String initialConditions, String simulationOutput) {
        ENHSP p = new ENHSP(false);
        p.parseDomainProblem(domain, initialConditions, Integer.toString(10), getPrintStream());
        return null;
    }

    private PrintStream getPrintStream(){
        return new PrintStream(new OutputStream() {
            public void write(int b) {
            }
        });
    }
}
