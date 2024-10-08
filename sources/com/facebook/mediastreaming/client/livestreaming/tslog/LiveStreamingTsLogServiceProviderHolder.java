package com.facebook.mediastreaming.client.livestreaming.tslog;

import X.0dV;
import X.C62984Kpa;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf.BatteryMonitor;

public final class LiveStreamingTsLogServiceProviderHolder extends ServiceProviderHolder {
    public static final C62984Kpa Companion = new Object();

    private final native void initHybrid(BatteryMonitor batteryMonitor, int i, boolean z, boolean z2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Kpa, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-tslog");
    }

    public LiveStreamingTsLogServiceProviderHolder(BatteryMonitor batteryMonitor, int i, boolean z, boolean z2) {
        initHybrid(batteryMonitor, i, z, z2);
    }
}
