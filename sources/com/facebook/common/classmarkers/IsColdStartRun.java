package com.facebook.common.classmarkers;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

public class IsColdStartRun {
    public static final int BETAMAP_MARKER_VALUE = 1;

    static {
        ClassTracingLogger.A02(1);
    }
}
