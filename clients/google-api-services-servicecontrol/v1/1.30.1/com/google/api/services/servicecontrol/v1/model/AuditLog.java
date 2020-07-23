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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Common audit log format for Google Cloud Platform API operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditLog extends com.google.api.client.json.GenericJson {

  /**
   * Authentication information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuthenticationInfo authenticationInfo;

  /**
   * Authorization information. If there are multiple resources or permissions involved, then there
   * is one AuthorizationInfo element for each {resource, permission} tuple.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuthorizationInfo> authorizationInfo;

  /**
   * Other service-specific data about the request, response, and other information associated with
   * the current audited event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * The name of the service method or operation. For API calls, this should be the name of the API
   * method. For example,
   *
   *     "google.cloud.bigquery.v2.TableService.InsertTable"
   * "google.logging.v2.ConfigServiceV2.CreateSink"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String methodName;

  /**
   * The number of items returned from a List or Query API method, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numResponseItems;

  /**
   * The operation request. This may not include all request parameters, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> request;

  /**
   * Metadata about the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * The resource location information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceLocation resourceLocation;

  /**
   * The resource or collection that is the target of the operation. The name is a scheme-less URI,
   * not including the API service name. For example:
   *
   *     "projects/PROJECT_ID/zones/us-central1-a/instances"
   * "projects/PROJECT_ID/datasets/DATASET_ID"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * The resource's original state before mutation. Present only for operations which have
   * successfully modified the targeted resource(s). In general, this field should contain all
   * changed fields, except those that are already been included in `request`, `response`,
   * `metadata` or `service_data` fields. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> resourceOriginalState;

  /**
   * The operation response. This may not include all response elements, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> response;

  /**
   * Deprecated. Use the `metadata` field instead. Other service-specific data about the request,
   * response, and other activities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> serviceData;

  /**
   * The name of the API service performing the operation. For example, `"compute.googleapis.com"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The status of the overall operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * Authentication information.
   * @return value or {@code null} for none
   */
  public AuthenticationInfo getAuthenticationInfo() {
    return authenticationInfo;
  }

  /**
   * Authentication information.
   * @param authenticationInfo authenticationInfo or {@code null} for none
   */
  public AuditLog setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
    this.authenticationInfo = authenticationInfo;
    return this;
  }

  /**
   * Authorization information. If there are multiple resources or permissions involved, then there
   * is one AuthorizationInfo element for each {resource, permission} tuple.
   * @return value or {@code null} for none
   */
  public java.util.List<AuthorizationInfo> getAuthorizationInfo() {
    return authorizationInfo;
  }

  /**
   * Authorization information. If there are multiple resources or permissions involved, then there
   * is one AuthorizationInfo element for each {resource, permission} tuple.
   * @param authorizationInfo authorizationInfo or {@code null} for none
   */
  public AuditLog setAuthorizationInfo(java.util.List<AuthorizationInfo> authorizationInfo) {
    this.authorizationInfo = authorizationInfo;
    return this;
  }

  /**
   * Other service-specific data about the request, response, and other information associated with
   * the current audited event.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Other service-specific data about the request, response, and other information associated with
   * the current audited event.
   * @param metadata metadata or {@code null} for none
   */
  public AuditLog setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The name of the service method or operation. For API calls, this should be the name of the API
   * method. For example,
   *
   *     "google.cloud.bigquery.v2.TableService.InsertTable"
   * "google.logging.v2.ConfigServiceV2.CreateSink"
   * @return value or {@code null} for none
   */
  public java.lang.String getMethodName() {
    return methodName;
  }

  /**
   * The name of the service method or operation. For API calls, this should be the name of the API
   * method. For example,
   *
   *     "google.cloud.bigquery.v2.TableService.InsertTable"
   * "google.logging.v2.ConfigServiceV2.CreateSink"
   * @param methodName methodName or {@code null} for none
   */
  public AuditLog setMethodName(java.lang.String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * The number of items returned from a List or Query API method, if applicable.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumResponseItems() {
    return numResponseItems;
  }

  /**
   * The number of items returned from a List or Query API method, if applicable.
   * @param numResponseItems numResponseItems or {@code null} for none
   */
  public AuditLog setNumResponseItems(java.lang.Long numResponseItems) {
    this.numResponseItems = numResponseItems;
    return this;
  }

  /**
   * The operation request. This may not include all request parameters, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getRequest() {
    return request;
  }

  /**
   * The operation request. This may not include all request parameters, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @param request request or {@code null} for none
   */
  public AuditLog setRequest(java.util.Map<String, java.lang.Object> request) {
    this.request = request;
    return this;
  }

  /**
   * Metadata about the operation.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Metadata about the operation.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public AuditLog setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  /**
   * The resource location information.
   * @return value or {@code null} for none
   */
  public ResourceLocation getResourceLocation() {
    return resourceLocation;
  }

  /**
   * The resource location information.
   * @param resourceLocation resourceLocation or {@code null} for none
   */
  public AuditLog setResourceLocation(ResourceLocation resourceLocation) {
    this.resourceLocation = resourceLocation;
    return this;
  }

  /**
   * The resource or collection that is the target of the operation. The name is a scheme-less URI,
   * not including the API service name. For example:
   *
   *     "projects/PROJECT_ID/zones/us-central1-a/instances"
   * "projects/PROJECT_ID/datasets/DATASET_ID"
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * The resource or collection that is the target of the operation. The name is a scheme-less URI,
   * not including the API service name. For example:
   *
   *     "projects/PROJECT_ID/zones/us-central1-a/instances"
   * "projects/PROJECT_ID/datasets/DATASET_ID"
   * @param resourceName resourceName or {@code null} for none
   */
  public AuditLog setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The resource's original state before mutation. Present only for operations which have
   * successfully modified the targeted resource(s). In general, this field should contain all
   * changed fields, except those that are already been included in `request`, `response`,
   * `metadata` or `service_data` fields. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getResourceOriginalState() {
    return resourceOriginalState;
  }

  /**
   * The resource's original state before mutation. Present only for operations which have
   * successfully modified the targeted resource(s). In general, this field should contain all
   * changed fields, except those that are already been included in `request`, `response`,
   * `metadata` or `service_data` fields. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @param resourceOriginalState resourceOriginalState or {@code null} for none
   */
  public AuditLog setResourceOriginalState(java.util.Map<String, java.lang.Object> resourceOriginalState) {
    this.resourceOriginalState = resourceOriginalState;
    return this;
  }

  /**
   * The operation response. This may not include all response elements, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getResponse() {
    return response;
  }

  /**
   * The operation response. This may not include all response elements, such as those that are too
   * large, privacy-sensitive, or duplicated elsewhere in the log record. It should never include
   * user-generated data, such as file contents. When the JSON object represented here has a proto
   * equivalent, the proto name will be indicated in the `@type` property.
   * @param response response or {@code null} for none
   */
  public AuditLog setResponse(java.util.Map<String, java.lang.Object> response) {
    this.response = response;
    return this;
  }

  /**
   * Deprecated. Use the `metadata` field instead. Other service-specific data about the request,
   * response, and other activities.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getServiceData() {
    return serviceData;
  }

  /**
   * Deprecated. Use the `metadata` field instead. Other service-specific data about the request,
   * response, and other activities.
   * @param serviceData serviceData or {@code null} for none
   */
  public AuditLog setServiceData(java.util.Map<String, java.lang.Object> serviceData) {
    this.serviceData = serviceData;
    return this;
  }

  /**
   * The name of the API service performing the operation. For example, `"compute.googleapis.com"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of the API service performing the operation. For example, `"compute.googleapis.com"`.
   * @param serviceName serviceName or {@code null} for none
   */
  public AuditLog setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The status of the overall operation.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * The status of the overall operation.
   * @param status status or {@code null} for none
   */
  public AuditLog setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public AuditLog set(String fieldName, Object value) {
    return (AuditLog) super.set(fieldName, value);
  }

  @Override
  public AuditLog clone() {
    return (AuditLog) super.clone();
  }

}
