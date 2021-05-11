package com.unige.urbantraffic.visualizer.manager.repository;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GoalClauseEnum {

    GREATER_THAN(">"),
    LOWER_THAN("<"),
    GREATER_THAN_EQUAL(">="),
    LOWER_THAN_EQUAL("<="),
    EQUALS("=");

    private String value;

    GoalClauseEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static GoalClauseEnum fromValue(String text) {
        for (GoalClauseEnum b : GoalClauseEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
