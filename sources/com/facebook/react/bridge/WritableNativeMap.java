package com.facebook.react.bridge;

import X.0Sd;
import X.C13948Tm8;
import X.C9532RcV;
import X.Pxe;
import X.SBO;

public final class WritableNativeMap extends ReadableNativeMap implements C13948Tm8 {
    public static final C9532RcV Companion = new Object();

    private final native void initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private final native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private final native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r4 instanceof com.facebook.react.bridge.ReadableNativeArray) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void putArray(java.lang.String r3, com.facebook.react.bridge.ReadableArray r4) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            if (r4 == 0) goto L_0x000b
            boolean r0 = r4 instanceof com.facebook.react.bridge.ReadableNativeArray
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "Illegal type provided"
            X.0Sd.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeArray r4 = (com.facebook.react.bridge.ReadableNativeArray) r4
            r2.putNativeArray(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeMap.putArray(java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public native void putLong(String str, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r4 instanceof com.facebook.react.bridge.ReadableNativeMap) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void putMap(java.lang.String r3, com.facebook.react.bridge.ReadableMap r4) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            if (r4 == 0) goto L_0x000b
            boolean r0 = r4 instanceof com.facebook.react.bridge.ReadableNativeMap
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "Illegal type provided"
            X.0Sd.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeMap r4 = (com.facebook.react.bridge.ReadableNativeMap) r4
            r2.putNativeMap(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeMap.putMap(java.lang.String, com.facebook.react.bridge.ReadableMap):void");
    }

    public native void putNull(String str);

    public native void putString(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RcV, java.lang.Object] */
    static {
        SBO.A00();
    }

    public WritableNativeMap() {
        initHybrid();
    }

    public C13948Tm8 copy() {
        WritableNativeMap A0U = Pxe.A0U();
        0Sd.A03(this instanceof ReadableNativeMap, "Illegal type provided");
        A0U.mergeNativeMap(this);
        return A0U;
    }
}
