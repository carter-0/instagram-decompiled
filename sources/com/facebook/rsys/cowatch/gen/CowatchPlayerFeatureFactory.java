package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class CowatchPlayerFeatureFactory {

    public final class CProxy extends CowatchPlayerFeatureFactory {
        public static native FeatureHolder create(CowatchPlayerProxy cowatchPlayerProxy, CowatchLiveClockProxy cowatchLiveClockProxy, CowatchLoggingProxy cowatchLoggingProxy, CowatchClosedCaptionProxy cowatchClosedCaptionProxy, CowatchAudioProxy cowatchAudioProxy, CowatchMediaInfoStore cowatchMediaInfoStore, CowatchAutoplayStore cowatchAutoplayStore, CowatchSuggestedContentQueueStore cowatchSuggestedContentQueueStore, int i);

        public static native CowatchPlayerFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
