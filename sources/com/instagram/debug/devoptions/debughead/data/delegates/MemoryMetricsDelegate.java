package com.instagram.debug.devoptions.debughead.data.delegates;

import X.0oU;
import X.C21292XSz;
import kotlin.enums.EnumEntries;

public interface MemoryMetricsDelegate {

    public enum MetricType {
        MEM_INFO;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            MetricType[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    void onMemoryMetricsReported(MetricType metricType, C21292XSz xSz);
}
