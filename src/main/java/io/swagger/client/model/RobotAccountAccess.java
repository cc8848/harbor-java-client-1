/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RobotAccountAccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class RobotAccountAccess {
  @SerializedName("resource")
  private String resource = null;

  @SerializedName("action")
  private String action = null;

  public RobotAccountAccess resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * the resource of harbor
   * @return resource
  **/
  @ApiModelProperty(value = "the resource of harbor")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public RobotAccountAccess action(String action) {
    this.action = action;
    return this;
  }

   /**
   * the action to resource that perdefined in harbor rbac
   * @return action
  **/
  @ApiModelProperty(value = "the action to resource that perdefined in harbor rbac")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotAccountAccess robotAccountAccess = (RobotAccountAccess) o;
    return Objects.equals(this.resource, robotAccountAccess.resource) &&
        Objects.equals(this.action, robotAccountAccess.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotAccountAccess {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

