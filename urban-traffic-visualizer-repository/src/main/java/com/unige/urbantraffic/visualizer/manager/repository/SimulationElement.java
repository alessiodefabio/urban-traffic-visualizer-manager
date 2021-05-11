package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public abstract class SimulationElement {

    private String simulationId;
}
