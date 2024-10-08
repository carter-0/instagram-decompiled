package com.facebook.mediastreaming.opt.sessionlog;

import X.0dV;
import X.XV6;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public final class SessionLogger extends ServiceProviderHolder {
    public static final XV6 Companion = new Object();

    private final native void initHybrid(String str);

    private final native void logMetadata(int i, String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XV6] */
    static {
        0dV.A0C("mediastreaming-sessionlog");
    }

    public SessionLogger(String str) {
        initHybrid(str);
    }
}
