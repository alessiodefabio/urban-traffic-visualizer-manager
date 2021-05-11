package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SimulationStep extends SimulationElement{

    private String simulationStepId;
    private Long simulationInstant;
    private List<Stage> activeStages;
    private List<SemaphoreSituation> semaphoreSituations;
    private List<LinkOccupancy> linkOccupancies;
}
