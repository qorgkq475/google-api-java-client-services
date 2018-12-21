/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dialogflow.v2.model;

/**
 * The request message for EntityTypes.BatchUpdateEntities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2BatchUpdateEntitiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The entities to update or create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> entities;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2EntityTypeEntity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2EntityTypeEntity.class);
  }

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported. Note: languages must
   * be enabled in the agent, before they can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. The mask to control which fields get updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The entities to update or create.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> getEntities() {
    return entities;
  }

  /**
   * Required. The entities to update or create.
   * @param entities entities or {@code null} for none
   */
  public GoogleCloudDialogflowV2BatchUpdateEntitiesRequest setEntities(java.util.List<GoogleCloudDialogflowV2EntityTypeEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported. Note: languages must
   * be enabled in the agent, before they can be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's
   * default language is used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported. Note: languages must
   * be enabled in the agent, before they can be used.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2BatchUpdateEntitiesRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. The mask to control which fields get updated.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Optional. The mask to control which fields get updated.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudDialogflowV2BatchUpdateEntitiesRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2BatchUpdateEntitiesRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2BatchUpdateEntitiesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2BatchUpdateEntitiesRequest clone() {
    return (GoogleCloudDialogflowV2BatchUpdateEntitiesRequest) super.clone();
  }

}
