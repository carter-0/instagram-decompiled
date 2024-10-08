package com.fbpay.ptt.impl.javacpp;

import X.0dV;
import X.DbU;
import com.facebook.jni.HybridData;
import java.util.List;

public class ServerCertsVerifierImpl {
    public HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native String verifyCerts(String[] strArr);

    public String verifyCerts(List list) {
        return verifyCerts(DbU.A1b(list, 0));
    }

    static {
        0dV.A0C("fbpayptt-android");
    }
}
