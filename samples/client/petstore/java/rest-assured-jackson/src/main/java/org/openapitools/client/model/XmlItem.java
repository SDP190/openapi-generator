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

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * XmlItem
 */
@JsonPropertyOrder({
  XmlItem.JSON_PROPERTY_ATTRIBUTE_STRING,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_NUMBER,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_INTEGER,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_BOOLEAN,
  XmlItem.JSON_PROPERTY_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_NAME_STRING,
  XmlItem.JSON_PROPERTY_NAME_NUMBER,
  XmlItem.JSON_PROPERTY_NAME_INTEGER,
  XmlItem.JSON_PROPERTY_NAME_BOOLEAN,
  XmlItem.JSON_PROPERTY_NAME_ARRAY,
  XmlItem.JSON_PROPERTY_NAME_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_STRING,
  XmlItem.JSON_PROPERTY_PREFIX_NUMBER,
  XmlItem.JSON_PROPERTY_PREFIX_INTEGER,
  XmlItem.JSON_PROPERTY_PREFIX_BOOLEAN,
  XmlItem.JSON_PROPERTY_PREFIX_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_NAMESPACE_STRING,
  XmlItem.JSON_PROPERTY_NAMESPACE_NUMBER,
  XmlItem.JSON_PROPERTY_NAMESPACE_INTEGER,
  XmlItem.JSON_PROPERTY_NAMESPACE_BOOLEAN,
  XmlItem.JSON_PROPERTY_NAMESPACE_ARRAY,
  XmlItem.JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_NS_STRING,
  XmlItem.JSON_PROPERTY_PREFIX_NS_NUMBER,
  XmlItem.JSON_PROPERTY_PREFIX_NS_INTEGER,
  XmlItem.JSON_PROPERTY_PREFIX_NS_BOOLEAN,
  XmlItem.JSON_PROPERTY_PREFIX_NS_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XmlItem {
  public static final String JSON_PROPERTY_ATTRIBUTE_STRING = "attribute_string";
  private String attributeString;

  public static final String JSON_PROPERTY_ATTRIBUTE_NUMBER = "attribute_number";
  private BigDecimal attributeNumber;

  public static final String JSON_PROPERTY_ATTRIBUTE_INTEGER = "attribute_integer";
  private Integer attributeInteger;

  public static final String JSON_PROPERTY_ATTRIBUTE_BOOLEAN = "attribute_boolean";
  private Boolean attributeBoolean;

  public static final String JSON_PROPERTY_WRAPPED_ARRAY = "wrapped_array";
  private List<Integer> wrappedArray;

  public static final String JSON_PROPERTY_NAME_STRING = "name_string";
  private String nameString;

  public static final String JSON_PROPERTY_NAME_NUMBER = "name_number";
  private BigDecimal nameNumber;

  public static final String JSON_PROPERTY_NAME_INTEGER = "name_integer";
  private Integer nameInteger;

  public static final String JSON_PROPERTY_NAME_BOOLEAN = "name_boolean";
  private Boolean nameBoolean;

  public static final String JSON_PROPERTY_NAME_ARRAY = "name_array";
  private List<Integer> nameArray;

  public static final String JSON_PROPERTY_NAME_WRAPPED_ARRAY = "name_wrapped_array";
  private List<Integer> nameWrappedArray;

  public static final String JSON_PROPERTY_PREFIX_STRING = "prefix_string";
  private String prefixString;

  public static final String JSON_PROPERTY_PREFIX_NUMBER = "prefix_number";
  private BigDecimal prefixNumber;

  public static final String JSON_PROPERTY_PREFIX_INTEGER = "prefix_integer";
  private Integer prefixInteger;

  public static final String JSON_PROPERTY_PREFIX_BOOLEAN = "prefix_boolean";
  private Boolean prefixBoolean;

  public static final String JSON_PROPERTY_PREFIX_ARRAY = "prefix_array";
  private List<Integer> prefixArray;

  public static final String JSON_PROPERTY_PREFIX_WRAPPED_ARRAY = "prefix_wrapped_array";
  private List<Integer> prefixWrappedArray;

  public static final String JSON_PROPERTY_NAMESPACE_STRING = "namespace_string";
  private String namespaceString;

  public static final String JSON_PROPERTY_NAMESPACE_NUMBER = "namespace_number";
  private BigDecimal namespaceNumber;

  public static final String JSON_PROPERTY_NAMESPACE_INTEGER = "namespace_integer";
  private Integer namespaceInteger;

  public static final String JSON_PROPERTY_NAMESPACE_BOOLEAN = "namespace_boolean";
  private Boolean namespaceBoolean;

  public static final String JSON_PROPERTY_NAMESPACE_ARRAY = "namespace_array";
  private List<Integer> namespaceArray;

  public static final String JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY = "namespace_wrapped_array";
  private List<Integer> namespaceWrappedArray;

  public static final String JSON_PROPERTY_PREFIX_NS_STRING = "prefix_ns_string";
  private String prefixNsString;

  public static final String JSON_PROPERTY_PREFIX_NS_NUMBER = "prefix_ns_number";
  private BigDecimal prefixNsNumber;

  public static final String JSON_PROPERTY_PREFIX_NS_INTEGER = "prefix_ns_integer";
  private Integer prefixNsInteger;

  public static final String JSON_PROPERTY_PREFIX_NS_BOOLEAN = "prefix_ns_boolean";
  private Boolean prefixNsBoolean;

  public static final String JSON_PROPERTY_PREFIX_NS_ARRAY = "prefix_ns_array";
  private List<Integer> prefixNsArray;

  public static final String JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY = "prefix_ns_wrapped_array";
  private List<Integer> prefixNsWrappedArray;

  public XmlItem() {
  }

  public XmlItem attributeString(String attributeString) {
    
    this.attributeString = attributeString;
    return this;
  }

   /**
   * Get attributeString
   * @return attributeString
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttributeString() {
    return attributeString;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeString(String attributeString) {
    this.attributeString = attributeString;
  }


  public XmlItem attributeNumber(BigDecimal attributeNumber) {
    
    this.attributeNumber = attributeNumber;
    return this;
  }

   /**
   * Get attributeNumber
   * @return attributeNumber
  **/
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }


  public XmlItem attributeInteger(Integer attributeInteger) {
    
    this.attributeInteger = attributeInteger;
    return this;
  }

   /**
   * Get attributeInteger
   * @return attributeInteger
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttributeInteger() {
    return attributeInteger;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }


  public XmlItem attributeBoolean(Boolean attributeBoolean) {
    
    this.attributeBoolean = attributeBoolean;
    return this;
  }

   /**
   * Get attributeBoolean
   * @return attributeBoolean
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAttributeBoolean() {
    return attributeBoolean;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }


  public XmlItem wrappedArray(List<Integer> wrappedArray) {
    
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

   /**
   * Get wrappedArray
   * @return wrappedArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }


  @JsonProperty(JSON_PROPERTY_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }


  public XmlItem nameString(String nameString) {
    
    this.nameString = nameString;
    return this;
  }

   /**
   * Get nameString
   * @return nameString
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameString() {
    return nameString;
  }


  @JsonProperty(JSON_PROPERTY_NAME_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameString(String nameString) {
    this.nameString = nameString;
  }


  public XmlItem nameNumber(BigDecimal nameNumber) {
    
    this.nameNumber = nameNumber;
    return this;
  }

   /**
   * Get nameNumber
   * @return nameNumber
  **/
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_NAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNameNumber() {
    return nameNumber;
  }


  @JsonProperty(JSON_PROPERTY_NAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }


  public XmlItem nameInteger(Integer nameInteger) {
    
    this.nameInteger = nameInteger;
    return this;
  }

   /**
   * Get nameInteger
   * @return nameInteger
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNameInteger() {
    return nameInteger;
  }


  @JsonProperty(JSON_PROPERTY_NAME_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
  }


  public XmlItem nameBoolean(Boolean nameBoolean) {
    
    this.nameBoolean = nameBoolean;
    return this;
  }

   /**
   * Get nameBoolean
   * @return nameBoolean
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isNameBoolean() {
    return nameBoolean;
  }


  @JsonProperty(JSON_PROPERTY_NAME_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }


  public XmlItem nameArray(List<Integer> nameArray) {
    
    this.nameArray = nameArray;
    return this;
  }

  public XmlItem addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

   /**
   * Get nameArray
   * @return nameArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getNameArray() {
    return nameArray;
  }


  @JsonProperty(JSON_PROPERTY_NAME_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
  }


  public XmlItem nameWrappedArray(List<Integer> nameWrappedArray) {
    
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

   /**
   * Get nameWrappedArray
   * @return nameWrappedArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }


  @JsonProperty(JSON_PROPERTY_NAME_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }


  public XmlItem prefixString(String prefixString) {
    
    this.prefixString = prefixString;
    return this;
  }

   /**
   * Get prefixString
   * @return prefixString
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefixString() {
    return prefixString;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixString(String prefixString) {
    this.prefixString = prefixString;
  }


  public XmlItem prefixNumber(BigDecimal prefixNumber) {
    
    this.prefixNumber = prefixNumber;
    return this;
  }

   /**
   * Get prefixNumber
   * @return prefixNumber
  **/
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_PREFIX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }


  public XmlItem prefixInteger(Integer prefixInteger) {
    
    this.prefixInteger = prefixInteger;
    return this;
  }

   /**
   * Get prefixInteger
   * @return prefixInteger
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixInteger() {
    return prefixInteger;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }


  public XmlItem prefixBoolean(Boolean prefixBoolean) {
    
    this.prefixBoolean = prefixBoolean;
    return this;
  }

   /**
   * Get prefixBoolean
   * @return prefixBoolean
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPrefixBoolean() {
    return prefixBoolean;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }


  public XmlItem prefixArray(List<Integer> prefixArray) {
    
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

   /**
   * Get prefixArray
   * @return prefixArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPrefixArray() {
    return prefixArray;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }


  public XmlItem prefixWrappedArray(List<Integer> prefixWrappedArray) {
    
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

   /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }


  public XmlItem namespaceString(String namespaceString) {
    
    this.namespaceString = namespaceString;
    return this;
  }

   /**
   * Get namespaceString
   * @return namespaceString
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAMESPACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNamespaceString() {
    return namespaceString;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
  }


  public XmlItem namespaceNumber(BigDecimal namespaceNumber) {
    
    this.namespaceNumber = namespaceNumber;
    return this;
  }

   /**
   * Get namespaceNumber
   * @return namespaceNumber
  **/
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_NAMESPACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }


  public XmlItem namespaceInteger(Integer namespaceInteger) {
    
    this.namespaceInteger = namespaceInteger;
    return this;
  }

   /**
   * Get namespaceInteger
   * @return namespaceInteger
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAMESPACE_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }


  public XmlItem namespaceBoolean(Boolean namespaceBoolean) {
    
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

   /**
   * Get namespaceBoolean
   * @return namespaceBoolean
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAMESPACE_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isNamespaceBoolean() {
    return namespaceBoolean;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }


  public XmlItem namespaceArray(List<Integer> namespaceArray) {
    
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

   /**
   * Get namespaceArray
   * @return namespaceArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAMESPACE_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }


  public XmlItem namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

   /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }


  public XmlItem prefixNsString(String prefixNsString) {
    
    this.prefixNsString = prefixNsString;
    return this;
  }

   /**
   * Get prefixNsString
   * @return prefixNsString
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefixNsString() {
    return prefixNsString;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }


  public XmlItem prefixNsNumber(BigDecimal prefixNsNumber) {
    
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

   /**
   * Get prefixNsNumber
   * @return prefixNsNumber
  **/
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }


  public XmlItem prefixNsInteger(Integer prefixNsInteger) {
    
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

   /**
   * Get prefixNsInteger
   * @return prefixNsInteger
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }


  public XmlItem prefixNsBoolean(Boolean prefixNsBoolean) {
    
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

   /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPrefixNsBoolean() {
    return prefixNsBoolean;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }


  public XmlItem prefixNsArray(List<Integer> prefixNsArray) {
    
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

   /**
   * Get prefixNsArray
   * @return prefixNsArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }


  public XmlItem prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

   /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
  **/
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItem xmlItem = (XmlItem) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItem {\n");
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
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

