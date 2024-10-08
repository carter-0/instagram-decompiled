package com.facebook.rsys.reactions.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class ReactionsFeatureFactory {

    public final class CProxy extends ReactionsFeatureFactory {
        public static native FeatureHolder create(ReactionsProxy reactionsProxy);

        public static native ReactionsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
