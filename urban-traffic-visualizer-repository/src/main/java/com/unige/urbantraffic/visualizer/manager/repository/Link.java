package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Link extends SimulationElement{

    private String linkId;
    private Double capacity;
}
