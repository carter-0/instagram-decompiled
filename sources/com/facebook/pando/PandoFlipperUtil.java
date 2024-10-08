package com.facebook.pando;

import X.0dV;
import X.RW6;
import java.util.concurrent.Executor;

public final class PandoFlipperUtil {
    public static final RW6 Companion = new Object();

    public static final native PandoConsistencyStackJNI createConsistencyStack(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RW6, java.lang.Object] */
    static {
        0dV.A0C("pando-flipper-jni");
    }
}
