package com.unige.urbantraffic.visualizer.manager.repository;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Goal extends SimulationElement{

    private String goalId;
    private GoalRuleEnum goal;
    private List<GoalClause> linkId;

}
