package com.facebook.mediastreaming.opt.common;

import X.0Jc;
import X.0dV;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C16591Uxl;
import X.C16790V5x;
import com.facebook.jni.HybridData;

public class StreamingHybridClassBase {
    public static final C16790V5x Companion = new Object();
    public final HybridData mHybridData;

    public StreamingHybridClassBase(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    private final native void fireError(int i, String str, String str2, String str3);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V5x] */
    static {
        0dV.A0C("mediastreaming");
    }

    public final void fireError(C16591Uxl uxl, String str, Throwable th) {
        String str2;
        AnonymousClass7TG.A1N(uxl, str);
        String str3 = "";
        if (th != null) {
            str3 = th.toString();
            str2 = 0Jc.A00(th);
        } else {
            str2 = str3;
        }
        fireError(uxl.A00, str, str3, str2);
    }
}
