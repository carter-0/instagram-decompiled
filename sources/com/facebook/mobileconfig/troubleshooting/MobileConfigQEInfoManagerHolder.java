package com.facebook.mobileconfig.troubleshooting;

import X.0dV;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;

public abstract class MobileConfigQEInfoManagerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native boolean getQEInfo(MobileConfigQEInfoQueryParamsHolder mobileConfigQEInfoQueryParamsHolder, MobileConfigResponseCallback mobileConfigResponseCallback, String str, String str2);

    public native String getRNQEInfo();

    public native boolean hasRefreshedQEInfo();

    static {
        0dV.A0C("mobileconfigtroubleshooting-jni");
    }
}
