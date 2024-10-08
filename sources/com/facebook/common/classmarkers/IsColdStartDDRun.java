package com.facebook.common.classmarkers;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

public class IsColdStartDDRun {
    public static final int BETAMAP_MARKER_VALUE = 3;

    static {
        ClassTracingLogger.A02(3);
    }
}
