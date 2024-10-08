package com.facebook.rsys.trafficshaping.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class TrafficShapingFeatureFactory {

    public final class CProxy extends TrafficShapingFeatureFactory {
        public static native FeatureHolder create(TrafficShapingProxy trafficShapingProxy);

        public static native TrafficShapingFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
