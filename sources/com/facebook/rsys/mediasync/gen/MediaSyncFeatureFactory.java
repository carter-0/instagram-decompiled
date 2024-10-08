package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class MediaSyncFeatureFactory {

    public final class CProxy extends MediaSyncFeatureFactory {
        public static native FeatureHolder create(MediaSyncProxy mediaSyncProxy, McfReference mcfReference, boolean z, int i);

        public static native MediaSyncFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
