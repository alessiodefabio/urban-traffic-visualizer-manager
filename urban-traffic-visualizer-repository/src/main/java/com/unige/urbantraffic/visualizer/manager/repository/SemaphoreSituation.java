package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SemaphoreSituation extends SimulationElement{

    private String semaphoreId;
    private Integer greenTime;
    private Integer interTime;
}
