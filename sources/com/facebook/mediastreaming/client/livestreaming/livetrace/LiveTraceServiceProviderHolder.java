package com.facebook.mediastreaming.client.livestreaming.livetrace;

import X.0dV;
import X.XV3;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public final class LiveTraceServiceProviderHolder extends ServiceProviderHolder {
    public static final XV3 Companion = new Object();

    private final native void initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XV3, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-livetrace");
    }

    public LiveTraceServiceProviderHolder() {
        initHybrid();
    }
}
