package com.facebook.rsys.appstate.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class AppstateFeatureFactory {

    public final class CProxy extends AppstateFeatureFactory {
        public static native FeatureHolder create();

        public static native AppstateFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
