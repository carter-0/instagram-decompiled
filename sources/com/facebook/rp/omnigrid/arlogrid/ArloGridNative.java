package com.facebook.rp.omnigrid.arlogrid;

import X.0dV;
import X.C69719Nqf;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

public final class ArloGridNative {
    public static final C69719Nqf Companion = new Object();

    public static final native void jni_computeArloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Nqf, java.lang.Object] */
    static {
        0dV.A0C("omnigridjni");
    }
}
