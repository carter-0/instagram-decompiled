package com.facebook.rsys.networktraffic.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class NetworkTrafficFeatureFactory {

    public final class CProxy extends NetworkTrafficFeatureFactory {
        public static native FeatureHolder create(NetworkTrafficProxy networkTrafficProxy);

        public static native NetworkTrafficFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
