package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UrbanTrafficSimulation extends SimulationElement{

    private String simulationTitle;
    private OffsetDateTime simulationDateTime;
    private List<SimulationStep> simulationSteps;
    private Goal simulationGoal;
}
