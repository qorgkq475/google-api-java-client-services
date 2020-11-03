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

package com.google.api.services.analyticsdata.v1alpha.model;

/**
 * The request to generate a realtime report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunRealtimeReportRequest extends com.google.api.client.json.GenericJson {

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression dimensionFilter;

  /**
   * The dimensions requested and displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long limit;

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metricAggregations;

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression metricFilter;

  /**
   * The metrics requested and displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  static {
    // hack to force ProGuard to consider Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Metric.class);
  }

  /**
   * Specifies how rows are ordered in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderBy> orderBys;

  static {
    // hack to force ProGuard to consider OrderBy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderBy.class);
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's Realtime quota. Quota
   * is returned in [PropertyQuota](#PropertyQuota).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnPropertyQuota;

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getDimensionFilter() {
    return dimensionFilter;
  }

  /**
   * The filter clause of dimensions. Dimensions must be requested to be used in this filter.
   * Metrics cannot be used in this filter.
   * @param dimensionFilter dimensionFilter or {@code null} for none
   */
  public RunRealtimeReportRequest setDimensionFilter(FilterExpression dimensionFilter) {
    this.dimensionFilter = dimensionFilter;
    return this;
  }

  /**
   * The dimensions requested and displayed.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * The dimensions requested and displayed.
   * @param dimensions dimensions or {@code null} for none
   */
  public RunRealtimeReportRequest setDimensions(java.util.List<Dimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are
   * returned.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLimit() {
    return limit;
  }

  /**
   * The number of rows to return. If unspecified, 10 rows are returned. If -1, all rows are
   * returned.
   * @param limit limit or {@code null} for none
   */
  public RunRealtimeReportRequest setLimit(java.lang.Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetricAggregations() {
    return metricAggregations;
  }

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * @param metricAggregations metricAggregations or {@code null} for none
   */
  public RunRealtimeReportRequest setMetricAggregations(java.util.List<java.lang.String> metricAggregations) {
    this.metricAggregations = metricAggregations;
    return this;
  }

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getMetricFilter() {
    return metricFilter;
  }

  /**
   * The filter clause of metrics. Applied at post aggregation phase, similar to SQL having-clause.
   * Metrics must be requested to be used in this filter. Dimensions cannot be used in this filter.
   * @param metricFilter metricFilter or {@code null} for none
   */
  public RunRealtimeReportRequest setMetricFilter(FilterExpression metricFilter) {
    this.metricFilter = metricFilter;
    return this;
  }

  /**
   * The metrics requested and displayed.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * The metrics requested and displayed.
   * @param metrics metrics or {@code null} for none
   */
  public RunRealtimeReportRequest setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Specifies how rows are ordered in the response.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderBy> getOrderBys() {
    return orderBys;
  }

  /**
   * Specifies how rows are ordered in the response.
   * @param orderBys orderBys or {@code null} for none
   */
  public RunRealtimeReportRequest setOrderBys(java.util.List<OrderBy> orderBys) {
    this.orderBys = orderBys;
    return this;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's Realtime quota. Quota
   * is returned in [PropertyQuota](#PropertyQuota).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnPropertyQuota() {
    return returnPropertyQuota;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's Realtime quota. Quota
   * is returned in [PropertyQuota](#PropertyQuota).
   * @param returnPropertyQuota returnPropertyQuota or {@code null} for none
   */
  public RunRealtimeReportRequest setReturnPropertyQuota(java.lang.Boolean returnPropertyQuota) {
    this.returnPropertyQuota = returnPropertyQuota;
    return this;
  }

  @Override
  public RunRealtimeReportRequest set(String fieldName, Object value) {
    return (RunRealtimeReportRequest) super.set(fieldName, value);
  }

  @Override
  public RunRealtimeReportRequest clone() {
    return (RunRealtimeReportRequest) super.clone();
  }

}
