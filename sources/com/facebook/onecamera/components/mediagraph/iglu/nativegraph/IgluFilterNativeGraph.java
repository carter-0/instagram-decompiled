package com.facebook.onecamera.components.mediagraph.iglu.nativegraph;

import X.002;
import X.0dV;
import X.AnonymousClass05K;
import X.C345907uH;
import X.C367558rB;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.jni.HybridData;

public class IgluFilterNativeGraph {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native void render();

    public native void attach(IgluConfigHolder igluConfigHolder);

    public native void detach();

    public native void setClearFramebuffer(boolean z);

    public native void setInputTexture(IgluIODescriptor igluIODescriptor);

    public native void setOutputTexture(IgluIODescriptor igluIODescriptor);

    public native void updateFilter(FilterWeakPtr filterWeakPtr);

    public native void useCurrentOutputFramebuffer(int i);

    static {
        0dV.A0C("onecamera-iglufilter-graph");
    }

    public void render(String str) {
        render();
        C345907uH.A02(002.A0R("[IgluFilterNativeGraph#render]", str), new Object[0]);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    public void setInputTexture(int i, int i2, int i3, int i4) {
        Integer num;
        boolean z = false;
        int i5 = i2;
        if (i2 == 36197) {
            z = true;
        }
        C367558rB r0 = IgluIODescriptor.Companion;
        if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        int intValue = num.intValue();
        ? obj = new Object();
        obj.mHybridData = IgluIODescriptor.initHybrid(i, i5, i3, i4, intValue, 7);
        setInputTexture(obj);
    }
}
