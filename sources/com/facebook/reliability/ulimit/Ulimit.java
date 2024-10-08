package com.facebook.reliability.ulimit;

import X.0dV;

public class Ulimit {
    public static final boolean sNativeLibLoaded;

    public static native void setNativeMaxUlimit();

    static {
        boolean z;
        try {
            0dV.A0C("reliability");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sNativeLibLoaded = z;
    }
}
