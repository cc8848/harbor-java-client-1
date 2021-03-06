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
 * Another chart the chart depends on
 */
@ApiModel(description = "Another chart the chart depends on")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class Dependency {
  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("repository")
  private String repository = null;

  public Dependency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the chart denpendency
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the chart denpendency")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dependency version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the chart dependency
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of the chart dependency")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Dependency repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * The URL to the repository
   * @return repository
  **/
  @ApiModelProperty(value = "The URL to the repository")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.name, dependency.name) &&
        Objects.equals(this.version, dependency.version) &&
        Objects.equals(this.repository, dependency.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, repository);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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

