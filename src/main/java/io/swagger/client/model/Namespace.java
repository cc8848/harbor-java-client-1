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
 * The namespace of registry
 */
@ApiModel(description = "The namespace of registry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class Namespace {
  @SerializedName("name")
  private String name = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public Namespace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of namespace
   * @return name
  **/
  @ApiModelProperty(value = "The name of namespace")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Namespace metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata of namespace
   * @return metadata
  **/
  @ApiModelProperty(value = "The metadata of namespace")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Namespace namespace = (Namespace) o;
    return Objects.equals(this.name, namespace.name) &&
        Objects.equals(this.metadata, namespace.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Namespace {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

