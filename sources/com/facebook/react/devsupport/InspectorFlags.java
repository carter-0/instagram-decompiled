package com.facebook.react.devsupport;

import X.SBQ;

public final class InspectorFlags {
    public static final InspectorFlags INSTANCE = new Object();

    public static final native boolean getFuseboxEnabled();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.react.devsupport.InspectorFlags, java.lang.Object] */
    static {
        SBQ.A00();
    }
}
