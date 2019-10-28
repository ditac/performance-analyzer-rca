package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.metrics;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Metric;

public class Paging_MinfltRate extends Metric {
  public Paging_MinfltRate(long evaluationIntervalSeconds) {
    super(AllMetrics.OSMetrics.PAGING_MIN_FLT_RATE.name(), evaluationIntervalSeconds);
  }
}