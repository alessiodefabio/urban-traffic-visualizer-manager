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
 * number of cars that occupy the related junction
 */
@ApiModel(description = "number of cars that occupy the related junction")
@Validated

public class JunctionOccupancy   {
  @JsonProperty("junctionId")
  private String junctionId = null;

  @JsonProperty("occupancy")
  private Float occupancy = null;

  public JunctionOccupancy junctionId(String junctionId) {
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

  public JunctionOccupancy occupancy(Float occupancy) {
    this.occupancy = occupancy;
    return this;
  }

  /**
   * Get occupancy
   * @return occupancy
  **/
  @ApiModelProperty(value = "")


  public Float getOccupancy() {
    return occupancy;
  }

  public void setOccupancy(Float occupancy) {
    this.occupancy = occupancy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JunctionOccupancy junctionOccupancy = (JunctionOccupancy) o;
    return Objects.equals(this.junctionId, junctionOccupancy.junctionId) &&
        Objects.equals(this.occupancy, junctionOccupancy.occupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctionId, occupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JunctionOccupancy {\n");
    
    sb.append("    junctionId: ").append(toIndentedString(junctionId)).append("\n");
    sb.append("    occupancy: ").append(toIndentedString(occupancy)).append("\n");
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

