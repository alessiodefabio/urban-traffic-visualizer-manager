package com.unige.urbantraffic.visualizer.manager.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * stage switched of by the planner before the max green time is reached
 */
@ApiModel(description = "stage switched of by the planner before the max green time is reached")
@Validated

public class SwitchedStage   {
  @JsonProperty("junctionId")
  private String junctionId = null;

  @JsonProperty("stageId")
  private String stageId = null;

  public SwitchedStage junctionId(String junctionId) {
    this.junctionId = junctionId;
    return this;
  }

  /**
   * Get junctionId
   * @return junctionId
  **/
  @ApiModelProperty(value = "")


  public String getJunctionId() {
    return junctionId;
  }

  public void setJunctionId(String junctionId) {
    this.junctionId = junctionId;
  }

  public SwitchedStage stageId(String stageId) {
    this.stageId = stageId;
    return this;
  }

  /**
   * Get stageId
   * @return stageId
  **/
  @ApiModelProperty(value = "")


  public String getStageId() {
    return stageId;
  }

  public void setStageId(String stageId) {
    this.stageId = stageId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchedStage switchedStage = (SwitchedStage) o;
    return Objects.equals(this.junctionId, switchedStage.junctionId) &&
        Objects.equals(this.stageId, switchedStage.stageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctionId, stageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchedStage {\n");
    
    sb.append("    junctionId: ").append(toIndentedString(junctionId)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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

