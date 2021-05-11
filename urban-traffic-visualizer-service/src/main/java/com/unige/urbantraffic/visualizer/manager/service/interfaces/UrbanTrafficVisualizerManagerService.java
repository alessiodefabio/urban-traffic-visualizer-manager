package com.unige.urbantraffic.visualizer.manager.service.interfaces;

import com.unige.urbantraffic.visualizer.manager.model.v1.Simulation;

import java.io.InputStream;

public interface UrbanTrafficVisualizerManagerService {
    Simulation getSimulation(String domain, String initialConditions, String simulationOutput);
}
