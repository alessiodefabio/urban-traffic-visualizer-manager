package com.unige.urbantraffic.visualizer.manager.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.unige.urbantraffic.visualizer.manager.model.v1.Direction;
import com.unige.urbantraffic.visualizer.manager.model.v1.JunctionOccupancy;
import com.unige.urbantraffic.visualizer.manager.model.v1.LinkOccupancy;
import com.unige.urbantraffic.visualizer.manager.model.v1.SwitchedStage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * the planner output
 */
@ApiModel(description = "the planner output")
@Validated

public class PlannerResult   {
  @JsonProperty("instant")
  private BigDecimal instant = null;

  @JsonProperty("switchPhase")
  private SwitchedStage switchPhase = null;

  @JsonProperty("linksOccupancy")
  @Valid
  private List<LinkOccupancy> linksOccupancy = null;

  @JsonProperty("junctionOccupancy")
  @Valid
  private List<JunctionOccupancy> junctionOccupancy = null;

  @JsonProperty("directions")
  @Valid
  private List<Direction> directions = null;

  public PlannerResult instant(BigDecimal instant) {
    this.instant = instant;
    return this;
  }

  /**
   * instant of simulation misured in 1 second
   * @return instant
  **/
  @ApiModelProperty(value = "instant of simulation misured in 1 second")

  @Valid

  public BigDecimal getInstant() {
    return instant;
  }

  public void setInstant(BigDecimal instant) {
    this.instant = instant;
  }

  public PlannerResult switchPhase(SwitchedStage switchPhase) {
    this.switchPhase = switchPhase;
    return this;
  }

  /**
   * Get switchPhase
   * @return switchPhase
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SwitchedStage getSwitchPhase() {
    return switchPhase;
  }

  public void setSwitchPhase(SwitchedStage switchPhase) {
    this.switchPhase = switchPhase;
  }

  public PlannerResult linksOccupancy(List<LinkOccupancy> linksOccupancy) {
    this.linksOccupancy = linksOccupancy;
    return this;
  }

  public PlannerResult addLinksOccupancyItem(LinkOccupancy linksOccupancyItem) {
    if (this.linksOccupancy == null) {
      this.linksOccupancy = new ArrayList<>();
    }
    this.linksOccupancy.add(linksOccupancyItem);
    return this;
  }

  /**
   * Get linksOccupancy
   * @return linksOccupancy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<LinkOccupancy> getLinksOccupancy() {
    return linksOccupancy;
  }

  public void setLinksOccupancy(List<LinkOccupancy> linksOccupancy) {
    this.linksOccupancy = linksOccupancy;
  }

  public PlannerResult junctionOccupancy(List<JunctionOccupancy> junctionOccupancy) {
    this.junctionOccupancy = junctionOccupancy;
    return this;
  }

  public PlannerResult addJunctionOccupancyItem(JunctionOccupancy junctionOccupancyItem) {
    if (this.junctionOccupancy == null) {
      this.junctionOccupancy = new ArrayList<>();
    }
    this.junctionOccupancy.add(junctionOccupancyItem);
    return this;
  }

  /**
   * Get junctionOccupancy
   * @return junctionOccupancy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<JunctionOccupancy> getJunctionOccupancy() {
    return junctionOccupancy;
  }

  public void setJunctionOccupancy(List<JunctionOccupancy> junctionOccupancy) {
    this.junctionOccupancy = junctionOccupancy;
  }

  public PlannerResult directions(List<Direction> directions) {
    this.directions = directions;
    return this;
  }

  public PlannerResult addDirectionsItem(Direction directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<>();
    }
    this.directions.add(directionsItem);
    return this;
  }

  /**
   * Get directions
   * @return directions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Direction> getDirections() {
    return directions;
  }

  public void setDirections(List<Direction> directions) {
    this.directions = directions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlannerResult plannerResult = (PlannerResult) o;
    return Objects.equals(this.instant, plannerResult.instant) &&
        Objects.equals(this.switchPhase, plannerResult.switchPhase) &&
        Objects.equals(this.linksOccupancy, plannerResult.linksOccupancy) &&
        Objects.equals(this.junctionOccupancy, plannerResult.junctionOccupancy) &&
        Objects.equals(this.directions, plannerResult.directions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instant, switchPhase, linksOccupancy, junctionOccupancy, directions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlannerResult {\n");
    
    sb.append("    instant: ").append(toIndentedString(instant)).append("\n");
    sb.append("    switchPhase: ").append(toIndentedString(switchPhase)).append("\n");
    sb.append("    linksOccupancy: ").append(toIndentedString(linksOccupancy)).append("\n");
    sb.append("    junctionOccupancy: ").append(toIndentedString(junctionOccupancy)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

