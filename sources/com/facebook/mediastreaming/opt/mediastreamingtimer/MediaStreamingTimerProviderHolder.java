package com.facebook.mediastreaming.opt.mediastreamingtimer;

import X.0dV;
import X.C62986Kpc;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public final class MediaStreamingTimerProviderHolder extends ServiceProviderHolder {
    public static final C62986Kpc Companion = new Object();

    private final native void initHybrid(boolean z);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Kpc, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-mediastreamingtimer");
    }

    public MediaStreamingTimerProviderHolder(boolean z) {
        initHybrid(z);
    }
}
