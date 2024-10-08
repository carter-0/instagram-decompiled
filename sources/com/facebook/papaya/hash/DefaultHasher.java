package com.facebook.papaya.hash;

import X.0dV;
import X.RWC;

public final class DefaultHasher {
    public static final RWC Companion = new Object();

    public static final native long nativeHash(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RWC, java.lang.Object] */
    static {
        0dV.A0C("papaya-hash");
    }
}
