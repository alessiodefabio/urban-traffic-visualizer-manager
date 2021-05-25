package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Semaphore extends SimulationElement{

    private String semaphoreId;
    private Boolean isControllable;
    private List<Stage> stages;
}
