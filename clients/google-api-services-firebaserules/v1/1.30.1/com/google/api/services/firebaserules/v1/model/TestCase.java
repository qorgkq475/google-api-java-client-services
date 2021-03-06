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

package com.google.api.services.firebaserules.v1.model;

/**
 * `TestCase` messages provide the request context and an expectation as to whether the given
 * context will be allowed or denied. Test cases may specify the `request`, `resource`, and
 * `function_mocks` to mock a function call to a service-provided function. The `request` object
 * represents context present at request-time. The `resource` is the value of the target resource as
 * it appears in persistent storage before the request is executed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestCase extends com.google.api.client.json.GenericJson {

  /**
   * Test expectation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectation;

  /**
   * Specifies what should be included in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expressionReportLevel;

  /**
   * Optional function mocks for service-defined functions. If not set, any service defined function
   * is expected to return an error, which may or may not influence the test outcome.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FunctionMock> functionMocks;

  static {
    // hack to force ProGuard to consider FunctionMock used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FunctionMock.class);
  }

  /**
   * Specifies whether paths (such as request.path) are encoded and how.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathEncoding;

  /**
   * Request context. The exact format of the request context is service-dependent. See the
   * appropriate service documentation for information about the supported fields and types on the
   * request. Minimally, all services support the following fields and types: Request field | Type
   * ---------------|----------------- auth.uid | `string` auth.token | `map` headers | `map` method
   * | `string` params | `map` path | `string` time | `google.protobuf.Timestamp` If the request
   * value is not well-formed for the service, the request will be rejected as an invalid argument.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object request;

  /**
   * Optional resource value as it appears in persistent storage before the request is fulfilled.
   * The resource type depends on the `request.path` value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object resource;

  /**
   * Test expectation.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectation() {
    return expectation;
  }

  /**
   * Test expectation.
   * @param expectation expectation or {@code null} for none
   */
  public TestCase setExpectation(java.lang.String expectation) {
    this.expectation = expectation;
    return this;
  }

  /**
   * Specifies what should be included in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpressionReportLevel() {
    return expressionReportLevel;
  }

  /**
   * Specifies what should be included in the response.
   * @param expressionReportLevel expressionReportLevel or {@code null} for none
   */
  public TestCase setExpressionReportLevel(java.lang.String expressionReportLevel) {
    this.expressionReportLevel = expressionReportLevel;
    return this;
  }

  /**
   * Optional function mocks for service-defined functions. If not set, any service defined function
   * is expected to return an error, which may or may not influence the test outcome.
   * @return value or {@code null} for none
   */
  public java.util.List<FunctionMock> getFunctionMocks() {
    return functionMocks;
  }

  /**
   * Optional function mocks for service-defined functions. If not set, any service defined function
   * is expected to return an error, which may or may not influence the test outcome.
   * @param functionMocks functionMocks or {@code null} for none
   */
  public TestCase setFunctionMocks(java.util.List<FunctionMock> functionMocks) {
    this.functionMocks = functionMocks;
    return this;
  }

  /**
   * Specifies whether paths (such as request.path) are encoded and how.
   * @return value or {@code null} for none
   */
  public java.lang.String getPathEncoding() {
    return pathEncoding;
  }

  /**
   * Specifies whether paths (such as request.path) are encoded and how.
   * @param pathEncoding pathEncoding or {@code null} for none
   */
  public TestCase setPathEncoding(java.lang.String pathEncoding) {
    this.pathEncoding = pathEncoding;
    return this;
  }

  /**
   * Request context. The exact format of the request context is service-dependent. See the
   * appropriate service documentation for information about the supported fields and types on the
   * request. Minimally, all services support the following fields and types: Request field | Type
   * ---------------|----------------- auth.uid | `string` auth.token | `map` headers | `map` method
   * | `string` params | `map` path | `string` time | `google.protobuf.Timestamp` If the request
   * value is not well-formed for the service, the request will be rejected as an invalid argument.
   * @return value or {@code null} for none
   */
  public java.lang.Object getRequest() {
    return request;
  }

  /**
   * Request context. The exact format of the request context is service-dependent. See the
   * appropriate service documentation for information about the supported fields and types on the
   * request. Minimally, all services support the following fields and types: Request field | Type
   * ---------------|----------------- auth.uid | `string` auth.token | `map` headers | `map` method
   * | `string` params | `map` path | `string` time | `google.protobuf.Timestamp` If the request
   * value is not well-formed for the service, the request will be rejected as an invalid argument.
   * @param request request or {@code null} for none
   */
  public TestCase setRequest(java.lang.Object request) {
    this.request = request;
    return this;
  }

  /**
   * Optional resource value as it appears in persistent storage before the request is fulfilled.
   * The resource type depends on the `request.path` value.
   * @return value or {@code null} for none
   */
  public java.lang.Object getResource() {
    return resource;
  }

  /**
   * Optional resource value as it appears in persistent storage before the request is fulfilled.
   * The resource type depends on the `request.path` value.
   * @param resource resource or {@code null} for none
   */
  public TestCase setResource(java.lang.Object resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public TestCase set(String fieldName, Object value) {
    return (TestCase) super.set(fieldName, value);
  }

  @Override
  public TestCase clone() {
    return (TestCase) super.clone();
  }

}
