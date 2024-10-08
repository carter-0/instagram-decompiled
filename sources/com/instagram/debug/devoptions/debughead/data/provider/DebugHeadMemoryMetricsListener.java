package com.instagram.debug.devoptions.debughead.data.provider;

import X.01r;
import X.XIR;
import X.XIV;
import X.Y9F;
import X.Y9G;
import com.instagram.debug.devoptions.debughead.data.delegates.MemoryMetricsDelegate;

public class DebugHeadMemoryMetricsListener implements Y9G {
    public static DebugHeadMemoryMetricsListener sInstance;
    public MemoryMetricsDelegate mDelegate;

    public void reportTo(XIR xir, Y9F y9f) {
        int i = 0;
        while (true) {
            01r r4 = xir.A00;
            if (i < r4.size()) {
                Class<XIV> cls = XIV.class;
                if (r4.A05(i) == cls) {
                    this.mDelegate.onMemoryMetricsReported(MemoryMetricsDelegate.MetricType.MEM_INFO, cls.cast(r4.get(cls)));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.debug.devoptions.debughead.data.provider.DebugHeadMemoryMetricsListener, java.lang.Object] */
    public static synchronized DebugHeadMemoryMetricsListener getInstance() {
        DebugHeadMemoryMetricsListener debugHeadMemoryMetricsListener;
        synchronized (DebugHeadMemoryMetricsListener.class) {
            DebugHeadMemoryMetricsListener debugHeadMemoryMetricsListener2 = sInstance;
            debugHeadMemoryMetricsListener = debugHeadMemoryMetricsListener2;
            if (debugHeadMemoryMetricsListener2 == null) {
                ? obj = new Object();
                sInstance = obj;
                debugHeadMemoryMetricsListener = obj;
            }
        }
        return debugHeadMemoryMetricsListener;
    }

    public void setDelegate(MemoryMetricsDelegate memoryMetricsDelegate) {
        this.mDelegate = memoryMetricsDelegate;
    }
}
