package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GoalClause {

    private String goalId;
    private Double occupancy;
    private GoalClauseEnum goalRule;
    private String linkId;
}
