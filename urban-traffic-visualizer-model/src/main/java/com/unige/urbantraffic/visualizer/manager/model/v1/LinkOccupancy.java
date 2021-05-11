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
 * number of cars that occupy the related link
 */
@ApiModel(description = "number of cars that occupy the related link")
@Validated

public class LinkOccupancy   {
  @JsonProperty("linkId")
  private String linkId = null;

  @JsonProperty("occupancy")
  private Float occupancy = null;

  public LinkOccupancy linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * Get linkId
   * @return linkId
  **/
  @ApiModelProperty(value = "")


  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public LinkOccupancy occupancy(Float occupancy) {
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
    LinkOccupancy linkOccupancy = (LinkOccupancy) o;
    return Objects.equals(this.linkId, linkOccupancy.linkId) &&
        Objects.equals(this.occupancy, linkOccupancy.occupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, occupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOccupancy {\n");
    
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
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

