package com.instagram.pando.parsing;

import X.0dV;
import X.C13758TgU;
import X.Ri9;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.TreeJNI;

public final class IgPandoApiFrameworkParserJNI extends HybridClassBase implements C13758TgU {
    public static final Ri9 Companion = new Object();

    public native TreeJNI complete(Class cls);

    public native void parseByteArray(byte[] bArr, int i);

    public native void parseString(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ri9, java.lang.Object] */
    static {
        0dV.A0C("pando-parsing-instagram-jni");
    }
}
