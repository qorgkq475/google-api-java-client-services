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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * Request message to remove a tenant project resource from the tenancy unit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RemoveTenantProjectRequest extends com.google.api.client.json.GenericJson {

  /**
   * Tag of the resource within the tenancy unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * Tag of the resource within the tenancy unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * Tag of the resource within the tenancy unit.
   * @param tag tag or {@code null} for none
   */
  public RemoveTenantProjectRequest setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public RemoveTenantProjectRequest set(String fieldName, Object value) {
    return (RemoveTenantProjectRequest) super.set(fieldName, value);
  }

  @Override
  public RemoveTenantProjectRequest clone() {
    return (RemoveTenantProjectRequest) super.clone();
  }

}
