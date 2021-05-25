package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
public class TurnRate extends SimulationElement{

    private String activeStageId;
    private String exitLinkId;
    private String entryLinkId;
    private Float rate;
}
