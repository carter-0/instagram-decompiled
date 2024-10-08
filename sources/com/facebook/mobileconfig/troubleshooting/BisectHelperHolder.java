package com.facebook.mobileconfig.troubleshooting;

import X.0dV;
import X.C74478PvY;
import com.facebook.jni.HybridData;

public class BisectHelperHolder implements C74478PvY {
    public final HybridData mHybridData;

    public native BisectStateHolder getCurrentState();

    public native boolean goBackOneStep();

    public native void setBisectPath(String str);

    public native void startBisection(String str, BisectCallback bisectCallback);

    public native void startUsingExistingFile(String str);

    public native boolean stopBisection();

    public native boolean userDidNotReproduceBug();

    public native boolean userDidReproduceBug();

    static {
        0dV.A0C("mobileconfigtroubleshooting-jni");
    }

    public BisectHelperHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
