package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class LinkOccupancy extends SimulationElement{

    private String simulationStepId;
    private String linkId;
    private Double occupancy;
}
