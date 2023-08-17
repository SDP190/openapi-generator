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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PropertyNameCollision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PropertyNameCollision {
  public static final String SERIALIZED_NAME_UNDERSCORE_TYPE = "_type";
  @SerializedName(SERIALIZED_NAME_UNDERSCORE_TYPE)
  private String underscoreType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_WITH_UNDERSCORE = "type_";
  @SerializedName(SERIALIZED_NAME_TYPE_WITH_UNDERSCORE)
  private String typeWithUnderscore;

  public PropertyNameCollision() {
  }

  public PropertyNameCollision underscoreType(String underscoreType) {
    
    this.underscoreType = underscoreType;
    return this;
  }

   /**
   * Get underscoreType
   * @return underscoreType
  **/
  @javax.annotation.Nullable
  public String getUnderscoreType() {
    return underscoreType;
  }


  public void setUnderscoreType(String underscoreType) {
    this.underscoreType = underscoreType;
  }


  public PropertyNameCollision type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PropertyNameCollision typeWithUnderscore(String typeWithUnderscore) {
    
    this.typeWithUnderscore = typeWithUnderscore;
    return this;
  }

   /**
   * Get typeWithUnderscore
   * @return typeWithUnderscore
  **/
  @javax.annotation.Nullable
  public String getTypeWithUnderscore() {
    return typeWithUnderscore;
  }


  public void setTypeWithUnderscore(String typeWithUnderscore) {
    this.typeWithUnderscore = typeWithUnderscore;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PropertyNameCollision instance itself
   */
  public PropertyNameCollision putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyNameCollision propertyNameCollision = (PropertyNameCollision) o;
    return Objects.equals(this.underscoreType, propertyNameCollision.underscoreType) &&
        Objects.equals(this.type, propertyNameCollision.type) &&
        Objects.equals(this.typeWithUnderscore, propertyNameCollision.typeWithUnderscore)&&
        Objects.equals(this.additionalProperties, propertyNameCollision.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(underscoreType, type, typeWithUnderscore, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyNameCollision {\n");
    sb.append("    underscoreType: ").append(toIndentedString(underscoreType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeWithUnderscore: ").append(toIndentedString(typeWithUnderscore)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("_type");
    openapiFields.add("type");
    openapiFields.add("type_");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PropertyNameCollision
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropertyNameCollision.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertyNameCollision is not found in the empty JSON string", PropertyNameCollision.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("_type") != null && !jsonObj.get("_type").isJsonNull()) && !jsonObj.get("_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_type").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("type_") != null && !jsonObj.get("type_").isJsonNull()) && !jsonObj.get("type_").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type_` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type_").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertyNameCollision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertyNameCollision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertyNameCollision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertyNameCollision.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertyNameCollision>() {
           @Override
           public void write(JsonWriter out, PropertyNameCollision value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertyNameCollision read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PropertyNameCollision instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertyNameCollision given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertyNameCollision
  * @throws IOException if the JSON string is invalid with respect to PropertyNameCollision
  */
  public static PropertyNameCollision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertyNameCollision.class);
  }

 /**
  * Convert an instance of PropertyNameCollision to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

