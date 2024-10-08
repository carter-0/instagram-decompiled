package com.facebook.rsys.hdvideo.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class HdVideoFeatureFactory {

    public final class CProxy extends HdVideoFeatureFactory {
        public static native FeatureHolder create(HdVideoProxy hdVideoProxy);

        public static native HdVideoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
