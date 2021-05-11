package com.unige.urbantraffic.visualizer.manager.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.unige.urbantraffic.visualizer.manager.model.v1.Junction;
import com.unige.urbantraffic.visualizer.manager.model.v1.Link;
import com.unige.urbantraffic.visualizer.manager.model.v1.PlannerResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Simulation
 */
@Validated

public class Simulation   {
  @JsonProperty("junctions")
  @Valid
  private List<Junction> junctions = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("plannerResult")
  @Valid
  private List<PlannerResult> plannerResult = null;

  public Simulation junctions(List<Junction> junctions) {
    this.junctions = junctions;
    return this;
  }

  public Simulation addJunctionsItem(Junction junctionsItem) {
    if (this.junctions == null) {
      this.junctions = new ArrayList<>();
    }
    this.junctions.add(junctionsItem);
    return this;
  }

  /**
   * the junctions with links
   * @return junctions
  **/
  @ApiModelProperty(value = "the junctions with links")

  @Valid

  public List<Junction> getJunctions() {
    return junctions;
  }

  public void setJunctions(List<Junction> junctions) {
    this.junctions = junctions;
  }

  public Simulation links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Simulation addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * the links that build the map
   * @return links
  **/
  @ApiModelProperty(value = "the links that build the map")

  @Valid

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Simulation plannerResult(List<PlannerResult> plannerResult) {
    this.plannerResult = plannerResult;
    return this;
  }

  public Simulation addPlannerResultItem(PlannerResult plannerResultItem) {
    if (this.plannerResult == null) {
      this.plannerResult = new ArrayList<>();
    }
    this.plannerResult.add(plannerResultItem);
    return this;
  }

  /**
   * Get plannerResult
   * @return plannerResult
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PlannerResult> getPlannerResult() {
    return plannerResult;
  }

  public void setPlannerResult(List<PlannerResult> plannerResult) {
    this.plannerResult = plannerResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Simulation simulation = (Simulation) o;
    return Objects.equals(this.junctions, simulation.junctions) &&
        Objects.equals(this.links, simulation.links) &&
        Objects.equals(this.plannerResult, simulation.plannerResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctions, links, plannerResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Simulation {\n");
    
    sb.append("    junctions: ").append(toIndentedString(junctions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    plannerResult: ").append(toIndentedString(plannerResult)).append("\n");
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

