package com.autogeneral.tasks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * BalanceTestResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-29T00:04:46.240+10:00")

public class BalanceTestResult   {
  @JsonProperty("input")
  private String input = null;

  @JsonProperty("isBalanced")
  private Boolean isBalanced = null;

  public BalanceTestResult input(String input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "[(]", value = "")


  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public BalanceTestResult isBalanced(Boolean isBalanced) {
    this.isBalanced = isBalanced;
    return this;
  }

  /**
   * Get isBalanced
   * @return isBalanced
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsBalanced() {
    return isBalanced;
  }

  public void setIsBalanced(Boolean isBalanced) {
    this.isBalanced = isBalanced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceTestResult balanceTestResult = (BalanceTestResult) o;
    return Objects.equals(this.input, balanceTestResult.input) &&
        Objects.equals(this.isBalanced, balanceTestResult.isBalanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, isBalanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceTestResult {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    isBalanced: ").append(toIndentedString(isBalanced)).append("\n");
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

