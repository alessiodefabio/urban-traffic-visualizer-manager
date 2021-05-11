package com.unige.urbantraffic.visualizer.manager.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Link
 */
@Validated

public class Link   {
  @JsonProperty("linkId")
  private String linkId = null;

  @JsonProperty("capacity")
  private Float capacity = null;

  @JsonProperty("associatedJunctions")
  @Valid
  private List<String> associatedJunctions = null;

  public Link linkId(String linkId) {
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

  public Link capacity(Float capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")


  public Float getCapacity() {
    return capacity;
  }

  public void setCapacity(Float capacity) {
    this.capacity = capacity;
  }

  public Link associatedJunctions(List<String> associatedJunctions) {
    this.associatedJunctions = associatedJunctions;
    return this;
  }

  public Link addAssociatedJunctionsItem(String associatedJunctionsItem) {
    if (this.associatedJunctions == null) {
      this.associatedJunctions = new ArrayList<>();
    }
    this.associatedJunctions.add(associatedJunctionsItem);
    return this;
  }

  /**
   * junction identifiers that are connected with this link
   * @return associatedJunctions
  **/
  @ApiModelProperty(value = "junction identifiers that are connected with this link")


  public List<String> getAssociatedJunctions() {
    return associatedJunctions;
  }

  public void setAssociatedJunctions(List<String> associatedJunctions) {
    this.associatedJunctions = associatedJunctions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.linkId, link.linkId) &&
        Objects.equals(this.capacity, link.capacity) &&
        Objects.equals(this.associatedJunctions, link.associatedJunctions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, capacity, associatedJunctions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    associatedJunctions: ").append(toIndentedString(associatedJunctions)).append("\n");
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

