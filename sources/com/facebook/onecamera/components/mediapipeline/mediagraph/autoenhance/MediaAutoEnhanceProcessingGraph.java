package com.facebook.onecamera.components.mediapipeline.mediagraph.autoenhance;

import X.0dV;
import X.AnonymousClass7TG;
import X.C48084EVc;
import X.C48303EcM;
import X.UwJ;
import com.facebook.compphoto.sdk.pipeline.graphs.common.autoenhanceinfo.AutoEnhanceInfo;
import com.facebook.jni.HybridData;

public final class MediaAutoEnhanceProcessingGraph {
    public static final C48303EcM Companion = new Object();
    public static boolean didNativeLibraryLoaded;
    public static String errorMessage;
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, int i2);

    public final native void analyze(int i, int i2, int i3, AutoEnhanceInfo autoEnhanceInfo);

    public final native AutoEnhanceInfo getAutoEnhanceInfo();

    public final native void render(int i, int i2, int i3, int i4, int i5, int i6, AutoEnhanceInfo autoEnhanceInfo);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.EcM, java.lang.Object] */
    static {
        boolean z;
        errorMessage = "";
        try {
            0dV.A0C("onecamera-autoenhance-native-android");
            z = true;
        } catch (Exception e) {
            errorMessage = String.valueOf(e.getMessage());
            z = false;
        }
        didNativeLibraryLoaded = z;
    }

    public MediaAutoEnhanceProcessingGraph(C48084EVc eVc, UwJ uwJ) {
        AnonymousClass7TG.A1O(eVc, uwJ);
        if (didNativeLibraryLoaded) {
            this.mHybridData = initHybrid(eVc.ordinal(), uwJ.ordinal());
        }
    }
}
