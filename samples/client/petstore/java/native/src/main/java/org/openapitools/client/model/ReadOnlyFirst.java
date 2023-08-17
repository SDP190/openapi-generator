/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReadOnlyFirst
 */
@JsonPropertyOrder({
  ReadOnlyFirst.JSON_PROPERTY_BAR,
  ReadOnlyFirst.JSON_PROPERTY_BAZ
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadOnlyFirst {
  public static final String JSON_PROPERTY_BAR = "bar";
  private String bar;

  public static final String JSON_PROPERTY_BAZ = "baz";
  private String baz;

  public ReadOnlyFirst() { 
  }

  @JsonCreator
  public ReadOnlyFirst(
    @JsonProperty(JSON_PROPERTY_BAR) String bar
  ) {
  this();
    this.bar = bar;
  }

   /**
   * Get bar
   * @return bar
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBar() {
    return bar;
  }




  public ReadOnlyFirst baz(String baz) {
    this.baz = baz;
    return this;
  }

   /**
   * Get baz
   * @return baz
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaz() {
    return baz;
  }


  @JsonProperty(JSON_PROPERTY_BAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaz(String baz) {
    this.baz = baz;
  }


  /**
   * Return true if this ReadOnlyFirst object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyFirst readOnlyFirst = (ReadOnlyFirst) o;
    return Objects.equals(this.bar, readOnlyFirst.bar) &&
        Objects.equals(this.baz, readOnlyFirst.baz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, baz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirst {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `bar` to the URL query string
    if (getBar() != null) {
      joiner.add(String.format("%sbar%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBar()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `baz` to the URL query string
    if (getBaz() != null) {
      joiner.add(String.format("%sbaz%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaz()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

