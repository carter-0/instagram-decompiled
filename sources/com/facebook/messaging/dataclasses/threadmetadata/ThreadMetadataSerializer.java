package com.facebook.messaging.dataclasses.threadmetadata;

import X.0dV;
import X.0fh;

public class ThreadMetadataSerializer {
    public static native ThreadMetadataImpl fromJSONString(String str);

    public static native void init();

    public static native String toJSONString(ThreadMetadataImpl threadMetadataImpl);

    static {
        0fh.A01("ThreadMetadataSerializer.loadLibrary", -943557503);
        0dV.A0C("pandoblobserializerjni");
        0dV.A0C("pando-jni");
        0fh.A00(-1181566678);
    }

    public static ThreadMetadata fromString(String str) {
        ThreadMetadataImpl fromJSONString;
        int i;
        0fh.A01("ThreadMetadataSerializer.fromString", -2094093226);
        if (str == null) {
            fromJSONString = null;
            i = 435925200;
        } else {
            try {
                fromJSONString = fromJSONString(str);
                i = -911614009;
            } catch (Throwable th) {
                0fh.A00(320813458);
                throw th;
            }
        }
        0fh.A00(i);
        return fromJSONString;
    }

    public static String toString(ThreadMetadata threadMetadata) {
        String jSONString;
        int i;
        0fh.A01("ThreadMetadataSerializer.toString", 1908040832);
        if (threadMetadata == null) {
            jSONString = null;
            i = 655447919;
        } else {
            try {
                jSONString = toJSONString((ThreadMetadataImpl) threadMetadata);
                i = -1194892495;
            } catch (Throwable th) {
                0fh.A00(-2013540444);
                throw th;
            }
        }
        0fh.A00(i);
        return jSONString;
    }
}
