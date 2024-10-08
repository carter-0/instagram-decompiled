package com.facebook.mobileconfig.troubleshooting;

import X.0dV;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.Set;

public abstract class MobileConfigValueExplainerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native String getClientDrivenInfo(String str, Set set, int i);

    static {
        0dV.A0C("mobileconfigtroubleshooting-jni");
    }
}
