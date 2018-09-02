package com.autogeneral.tasks.model;

import java.util.Objects;
import com.autogeneral.tasks.model.ToDoItemNotFoundErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ToDoItemNotFoundError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-29T00:04:46.240+10:00")

public class ToDoItemNotFoundError   {
  @JsonProperty("details")
  @Valid
  private List<ToDoItemNotFoundErrorDetails> details = null;

  @JsonProperty("name")
  private String name = null;

  public ToDoItemNotFoundError details(List<ToDoItemNotFoundErrorDetails> details) {
    this.details = details;
    return this;
  }

  public ToDoItemNotFoundError addDetailsItem(ToDoItemNotFoundErrorDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ToDoItemNotFoundErrorDetails> getDetails() {
    return details;
  }

  public void setDetails(List<ToDoItemNotFoundErrorDetails> details) {
    this.details = details;
  }

  public ToDoItemNotFoundError name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "NotFoundError", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToDoItemNotFoundError toDoItemNotFoundError = (ToDoItemNotFoundError) o;
    return Objects.equals(this.details, toDoItemNotFoundError.details) &&
        Objects.equals(this.name, toDoItemNotFoundError.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToDoItemNotFoundError {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

