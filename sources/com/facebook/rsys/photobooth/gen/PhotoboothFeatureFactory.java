package com.facebook.rsys.photobooth.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class PhotoboothFeatureFactory {

    public final class CProxy extends PhotoboothFeatureFactory {
        public static native FeatureHolder create(PhotoboothProxy photoboothProxy, McfReference mcfReference);

        public static native PhotoboothFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
