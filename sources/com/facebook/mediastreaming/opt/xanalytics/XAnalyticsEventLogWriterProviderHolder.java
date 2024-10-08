package com.facebook.mediastreaming.opt.xanalytics;

import X.0dV;
import X.0qQ;
import X.XVD;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.xanalytics.XAnalyticsHolder;

public final class XAnalyticsEventLogWriterProviderHolder extends ServiceProviderHolder {
    public static final XVD Companion = new Object();

    public XAnalyticsEventLogWriterProviderHolder(XAnalyticsHolder xAnalyticsHolder, boolean z) {
        0qQ.A0B(xAnalyticsHolder, 1);
        initHybrid(xAnalyticsHolder, z);
    }

    private final native void initHybrid(XAnalyticsHolder xAnalyticsHolder, boolean z);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XVD] */
    static {
        0dV.A0C("mediastreaming-xanalytics");
    }
}
