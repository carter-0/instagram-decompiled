package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram;

import X.0dV;
import X.0qQ;
import X.C366528pB;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.SingleFilterFactory;
import com.facebook.jni.HybridData;

public final class InstagramFilterFactoryProvider {
    public static final C366528pB Companion = new Object();
    public HybridData mHybridData;

    private final native SingleFilterFactory createFilterFactoryNative(String str);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public SingleFilterFactory createFilterFactory(String str) {
        0qQ.A0B(str, 0);
        if (this.mHybridData == null) {
            0dV.A0C("mediapipeline-iglufilter-instagram");
            this.mHybridData = initHybrid();
        }
        return createFilterFactoryNative(str);
    }
}
