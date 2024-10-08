package com.truepic.lenssdkverify;

import X.0dV;

public class LibC2PA {
    public static native String filenameGetC2PAJson(String str);

    public static native Object[] filenameGetC2PAJsonWithThumbnails(String str);

    public static native String getC2PAJson(byte[] bArr);

    static {
        0dV.A0C("android_c2pa");
    }
}
