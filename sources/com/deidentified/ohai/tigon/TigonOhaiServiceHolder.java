package com.deidentified.ohai.tigon;

import X.0dV;
import X.0qQ;
import X.C253233qQ;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

public final class TigonOhaiServiceHolder extends TigonServiceHolder {
    public static final C253233qQ Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TigonOhaiServiceHolder(TigonServiceHolder tigonServiceHolder, String str, String str2) {
        super(initHybrid(tigonServiceHolder, str, str2));
        0qQ.A0B(tigonServiceHolder, 1);
    }

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3qQ, java.lang.Object] */
    static {
        0dV.A0C("tigonohaiserviceholder-jni");
    }
}
