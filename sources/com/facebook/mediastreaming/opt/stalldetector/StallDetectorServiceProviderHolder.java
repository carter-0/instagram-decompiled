package com.facebook.mediastreaming.opt.stalldetector;

import X.0dV;
import X.0qQ;
import X.C62536KhS;
import X.C62987Kpd;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public final class StallDetectorServiceProviderHolder extends ServiceProviderHolder {
    public static final C62987Kpd Companion = new Object();

    public StallDetectorServiceProviderHolder(double d, double d2, double d3, boolean z, C62536KhS khS) {
        0qQ.A0B(khS, 5);
        initHybrid(d, d2, d3, z, khS.A00);
    }

    private final native void initHybrid(double d, double d2, double d3, boolean z, int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Kpd, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-stalldetector");
    }
}
