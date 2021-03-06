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

package com.google.api.services.bigquerydatatransfer.v1.model;

/**
 * Returns list of supported data sources and their metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDataSourcesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of supported data sources and their transfer settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSource> dataSources;

  static {
    // hack to force ProGuard to consider DataSource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSource.class);
  }

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListDataSourcesRequest.page_token` to request the next page of list results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of supported data sources and their transfer settings.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSource> getDataSources() {
    return dataSources;
  }

  /**
   * List of supported data sources and their transfer settings.
   * @param dataSources dataSources or {@code null} for none
   */
  public ListDataSourcesResponse setDataSources(java.util.List<DataSource> dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListDataSourcesRequest.page_token` to request the next page of list results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListDataSourcesRequest.page_token` to request the next page of list results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListDataSourcesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListDataSourcesResponse set(String fieldName, Object value) {
    return (ListDataSourcesResponse) super.set(fieldName, value);
  }

  @Override
  public ListDataSourcesResponse clone() {
    return (ListDataSourcesResponse) super.clone();
  }

}
