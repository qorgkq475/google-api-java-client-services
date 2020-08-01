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
 * Identity delegation history of an authenticated service account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAccountDelegationInfo extends com.google.api.client.json.GenericJson {

  /**
   * First party (Google) identity as the real authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FirstPartyPrincipal firstPartyPrincipal;

  /**
   * Third party identity as the real authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThirdPartyPrincipal thirdPartyPrincipal;

  /**
   * First party (Google) identity as the real authority.
   * @return value or {@code null} for none
   */
  public FirstPartyPrincipal getFirstPartyPrincipal() {
    return firstPartyPrincipal;
  }

  /**
   * First party (Google) identity as the real authority.
   * @param firstPartyPrincipal firstPartyPrincipal or {@code null} for none
   */
  public ServiceAccountDelegationInfo setFirstPartyPrincipal(FirstPartyPrincipal firstPartyPrincipal) {
    this.firstPartyPrincipal = firstPartyPrincipal;
    return this;
  }

  /**
   * Third party identity as the real authority.
   * @return value or {@code null} for none
   */
  public ThirdPartyPrincipal getThirdPartyPrincipal() {
    return thirdPartyPrincipal;
  }

  /**
   * Third party identity as the real authority.
   * @param thirdPartyPrincipal thirdPartyPrincipal or {@code null} for none
   */
  public ServiceAccountDelegationInfo setThirdPartyPrincipal(ThirdPartyPrincipal thirdPartyPrincipal) {
    this.thirdPartyPrincipal = thirdPartyPrincipal;
    return this;
  }

  @Override
  public ServiceAccountDelegationInfo set(String fieldName, Object value) {
    return (ServiceAccountDelegationInfo) super.set(fieldName, value);
  }

  @Override
  public ServiceAccountDelegationInfo clone() {
    return (ServiceAccountDelegationInfo) super.clone();
  }

}
