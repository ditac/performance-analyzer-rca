package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.metrics;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Metric;

public class Heap_Committed extends Metric {
    public Heap_Committed(long evaluationIntervalSeconds) {
        super(AllMetrics.HeapValue.HEAP_COMMITTED.name(), evaluationIntervalSeconds);
    }
}

