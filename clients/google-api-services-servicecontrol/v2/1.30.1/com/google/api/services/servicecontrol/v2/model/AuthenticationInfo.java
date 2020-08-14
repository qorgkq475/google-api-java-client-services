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

package com.google.api.services.servicecontrol.v2.model;

/**
 * Authentication information for the operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthenticationInfo extends com.google.api.client.json.GenericJson {

  /**
   * The authority selector specified by the requestor, if any. It is not guaranteed that the
   * principal was allowed to use this authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authoritySelector;

  /**
   * The email address of the authenticated user (or service account on behalf of third party
   * principal) making the request. For privacy reasons, the principal email address is redacted for
   * all read-only operations that fail with a "permission denied" error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalEmail;

  /**
   * String representation of identity of requesting party. Populated for both first and third party
   * identities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalSubject;

  /**
   * Identity delegation history of an authenticated service account that makes the request. It
   * contains information on the real authorities that try to access GCP resources by delegating on
   * a service account. When multiple authorities present, they are guaranteed to be sorted based on
   * the original ordering of the identity delegation events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceAccountDelegationInfo> serviceAccountDelegationInfo;

  /**
   * The name of the service account key used to create or exchange credentials for authenticating
   * the service account making the request. This is a scheme-less URI full resource name. For
   * example: "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountKeyName;

  /**
   * The third party identification (if any) of the authenticated user making the request. When the
   * JSON object represented here has a proto equivalent, the proto name will be indicated in the
   * `@type` property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> thirdPartyPrincipal;

  /**
   * The authority selector specified by the requestor, if any. It is not guaranteed that the
   * principal was allowed to use this authority.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthoritySelector() {
    return authoritySelector;
  }

  /**
   * The authority selector specified by the requestor, if any. It is not guaranteed that the
   * principal was allowed to use this authority.
   * @param authoritySelector authoritySelector or {@code null} for none
   */
  public AuthenticationInfo setAuthoritySelector(java.lang.String authoritySelector) {
    this.authoritySelector = authoritySelector;
    return this;
  }

  /**
   * The email address of the authenticated user (or service account on behalf of third party
   * principal) making the request. For privacy reasons, the principal email address is redacted for
   * all read-only operations that fail with a "permission denied" error.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalEmail() {
    return principalEmail;
  }

  /**
   * The email address of the authenticated user (or service account on behalf of third party
   * principal) making the request. For privacy reasons, the principal email address is redacted for
   * all read-only operations that fail with a "permission denied" error.
   * @param principalEmail principalEmail or {@code null} for none
   */
  public AuthenticationInfo setPrincipalEmail(java.lang.String principalEmail) {
    this.principalEmail = principalEmail;
    return this;
  }

  /**
   * String representation of identity of requesting party. Populated for both first and third party
   * identities.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalSubject() {
    return principalSubject;
  }

  /**
   * String representation of identity of requesting party. Populated for both first and third party
   * identities.
   * @param principalSubject principalSubject or {@code null} for none
   */
  public AuthenticationInfo setPrincipalSubject(java.lang.String principalSubject) {
    this.principalSubject = principalSubject;
    return this;
  }

  /**
   * Identity delegation history of an authenticated service account that makes the request. It
   * contains information on the real authorities that try to access GCP resources by delegating on
   * a service account. When multiple authorities present, they are guaranteed to be sorted based on
   * the original ordering of the identity delegation events.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceAccountDelegationInfo> getServiceAccountDelegationInfo() {
    return serviceAccountDelegationInfo;
  }

  /**
   * Identity delegation history of an authenticated service account that makes the request. It
   * contains information on the real authorities that try to access GCP resources by delegating on
   * a service account. When multiple authorities present, they are guaranteed to be sorted based on
   * the original ordering of the identity delegation events.
   * @param serviceAccountDelegationInfo serviceAccountDelegationInfo or {@code null} for none
   */
  public AuthenticationInfo setServiceAccountDelegationInfo(java.util.List<ServiceAccountDelegationInfo> serviceAccountDelegationInfo) {
    this.serviceAccountDelegationInfo = serviceAccountDelegationInfo;
    return this;
  }

  /**
   * The name of the service account key used to create or exchange credentials for authenticating
   * the service account making the request. This is a scheme-less URI full resource name. For
   * example: "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountKeyName() {
    return serviceAccountKeyName;
  }

  /**
   * The name of the service account key used to create or exchange credentials for authenticating
   * the service account making the request. This is a scheme-less URI full resource name. For
   * example: "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
   * @param serviceAccountKeyName serviceAccountKeyName or {@code null} for none
   */
  public AuthenticationInfo setServiceAccountKeyName(java.lang.String serviceAccountKeyName) {
    this.serviceAccountKeyName = serviceAccountKeyName;
    return this;
  }

  /**
   * The third party identification (if any) of the authenticated user making the request. When the
   * JSON object represented here has a proto equivalent, the proto name will be indicated in the
   * `@type` property.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getThirdPartyPrincipal() {
    return thirdPartyPrincipal;
  }

  /**
   * The third party identification (if any) of the authenticated user making the request. When the
   * JSON object represented here has a proto equivalent, the proto name will be indicated in the
   * `@type` property.
   * @param thirdPartyPrincipal thirdPartyPrincipal or {@code null} for none
   */
  public AuthenticationInfo setThirdPartyPrincipal(java.util.Map<String, java.lang.Object> thirdPartyPrincipal) {
    this.thirdPartyPrincipal = thirdPartyPrincipal;
    return this;
  }

  @Override
  public AuthenticationInfo set(String fieldName, Object value) {
    return (AuthenticationInfo) super.set(fieldName, value);
  }

  @Override
  public AuthenticationInfo clone() {
    return (AuthenticationInfo) super.clone();
  }

}
