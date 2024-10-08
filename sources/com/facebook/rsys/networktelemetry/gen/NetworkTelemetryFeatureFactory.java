package com.facebook.rsys.networktelemetry.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class NetworkTelemetryFeatureFactory {

    public final class CProxy extends NetworkTelemetryFeatureFactory {
        public static native FeatureHolder create();

        public static native NetworkTelemetryFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
