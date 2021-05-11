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
 * Direction
 */
@Validated

public class Direction   {
  @JsonProperty("junctionId")
  private String junctionId = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("numOfMovingCars")
  private Integer numOfMovingCars = null;

  public Direction junctionId(String junctionId) {
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

  public Direction from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Direction to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")


  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Direction numOfMovingCars(Integer numOfMovingCars) {
    this.numOfMovingCars = numOfMovingCars;
    return this;
  }

  /**
   * Get numOfMovingCars
   * @return numOfMovingCars
  **/
  @ApiModelProperty(value = "")


  public Integer getNumOfMovingCars() {
    return numOfMovingCars;
  }

  public void setNumOfMovingCars(Integer numOfMovingCars) {
    this.numOfMovingCars = numOfMovingCars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direction direction = (Direction) o;
    return Objects.equals(this.junctionId, direction.junctionId) &&
        Objects.equals(this.from, direction.from) &&
        Objects.equals(this.to, direction.to) &&
        Objects.equals(this.numOfMovingCars, direction.numOfMovingCars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctionId, from, to, numOfMovingCars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direction {\n");
    
    sb.append("    junctionId: ").append(toIndentedString(junctionId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    numOfMovingCars: ").append(toIndentedString(numOfMovingCars)).append("\n");
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

