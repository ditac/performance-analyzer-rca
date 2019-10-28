package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.metrics;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Metric;

public class Net_TCP_SendCWND extends Metric {
  public Net_TCP_SendCWND(long evaluationIntervalSeconds) {
    super(AllMetrics.TCPValue.Net_TCP_SEND_CWND.name(), evaluationIntervalSeconds);
  }
}
