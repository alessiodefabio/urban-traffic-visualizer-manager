package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Stage extends SimulationElement{

    private String stageId;
    private Integer interLimitAmount;
    private Integer defaultGreenTime;
    private Integer maxGreenTime;
    private Integer minGreenTime;
    private Stage nextStage;
}
