package com.facebook.rp.omnigrid.marlogrid;

import X.0dV;
import X.C69720Nqg;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

public final class MarloGridNative {
    public static final C69720Nqg Companion = new Object();

    public static final native void jni_computeMarloGridLayout(GridLayoutInput gridLayoutInput, GridLayoutOutputBuilder gridLayoutOutputBuilder);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Nqg, java.lang.Object] */
    static {
        0dV.A0C("omnigridjni");
    }
}
