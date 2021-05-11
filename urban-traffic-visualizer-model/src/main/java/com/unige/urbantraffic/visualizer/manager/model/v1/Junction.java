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
 * Junction
 */
@Validated

public class Junction   {
  @JsonProperty("junctionId")
  private String junctionId = null;

  @JsonProperty("associatedLinks")
  @Valid
  private List<String> associatedLinks = null;

  @JsonProperty("isControlled")
  private Boolean isControlled = null;

  @JsonProperty("controlledBy")
  @Valid
  private List<String> controlledBy = null;

  public Junction junctionId(String junctionId) {
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

  public Junction associatedLinks(List<String> associatedLinks) {
    this.associatedLinks = associatedLinks;
    return this;
  }

  public Junction addAssociatedLinksItem(String associatedLinksItem) {
    if (this.associatedLinks == null) {
      this.associatedLinks = new ArrayList<>();
    }
    this.associatedLinks.add(associatedLinksItem);
    return this;
  }

  /**
   * associated links identifier
   * @return associatedLinks
  **/
  @ApiModelProperty(value = "associated links identifier")


  public List<String> getAssociatedLinks() {
    return associatedLinks;
  }

  public void setAssociatedLinks(List<String> associatedLinks) {
    this.associatedLinks = associatedLinks;
  }

  public Junction isControlled(Boolean isControlled) {
    this.isControlled = isControlled;
    return this;
  }

  /**
   * Get isControlled
   * @return isControlled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsControlled() {
    return isControlled;
  }

  public void setIsControlled(Boolean isControlled) {
    this.isControlled = isControlled;
  }

  public Junction controlledBy(List<String> controlledBy) {
    this.controlledBy = controlledBy;
    return this;
  }

  public Junction addControlledByItem(String controlledByItem) {
    if (this.controlledBy == null) {
      this.controlledBy = new ArrayList<>();
    }
    this.controlledBy.add(controlledByItem);
    return this;
  }

  /**
   * stages idenfier that control this junction
   * @return controlledBy
  **/
  @ApiModelProperty(value = "stages idenfier that control this junction")


  public List<String> getControlledBy() {
    return controlledBy;
  }

  public void setControlledBy(List<String> controlledBy) {
    this.controlledBy = controlledBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Junction junction = (Junction) o;
    return Objects.equals(this.junctionId, junction.junctionId) &&
        Objects.equals(this.associatedLinks, junction.associatedLinks) &&
        Objects.equals(this.isControlled, junction.isControlled) &&
        Objects.equals(this.controlledBy, junction.controlledBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctionId, associatedLinks, isControlled, controlledBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Junction {\n");
    
    sb.append("    junctionId: ").append(toIndentedString(junctionId)).append("\n");
    sb.append("    associatedLinks: ").append(toIndentedString(associatedLinks)).append("\n");
    sb.append("    isControlled: ").append(toIndentedString(isControlled)).append("\n");
    sb.append("    controlledBy: ").append(toIndentedString(controlledBy)).append("\n");
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

