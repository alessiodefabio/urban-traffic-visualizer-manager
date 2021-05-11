package com.unige.urbantraffic.visualizer.manager.repository;

public enum GoalRuleEnum {
    AND("AND"),
    OR("OR"),
    NOT("NOT");

    private String value;

    GoalRuleEnum(String s) { this.value = s; }

    public String toString() { return String.valueOf(value); }

    public static GoalRuleEnum fromValue(String text) {
        for (GoalRuleEnum b : GoalRuleEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
