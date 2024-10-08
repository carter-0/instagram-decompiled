package com.facebook.mediastreaming.opt.timestampchecker;

import X.0dV;
import X.0qQ;
import X.C62537KhT;
import X.C62988Kpe;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public class TimestampCheckerServiceProviderHolder extends ServiceProviderHolder {
    public static final C62988Kpe Companion = new Object();

    public TimestampCheckerServiceProviderHolder(double d, double d2, double d3, int i, C62537KhT khT) {
        0qQ.A0B(khT, 5);
        initHybrid(d, d2, d3, i, khT.A00);
    }

    private final native void initHybrid(double d, double d2, double d3, int i, int i2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Kpe, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-timestampchecker");
    }
}
