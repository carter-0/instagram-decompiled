package com.facebook.mobileconfig.troubleshooting;

import X.0dV;
import com.facebook.jni.HybridData;

public class MobileConfigQEInfoQueryParamsHolder {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void setExperimentName(String str);

    public native void setGatekeeperName(String str);

    public native void setSkipQE(boolean z);

    public native void setUniverseRegex(String str);

    public native void withCurrentExperimentGroup(boolean z);

    public native void withExperiments(boolean z);

    public native void withGatekeepers(boolean z);

    public native void withGroupParams(boolean z);

    public native void withGroups(boolean z);

    public native void withParams(boolean z);

    public native void withUniverseParams(boolean z);

    static {
        0dV.A0C("mobileconfigtroubleshooting-jni");
    }
}
