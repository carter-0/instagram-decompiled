package com.instagram.debug.devoptions.debughead.data.provider;

import X.C21250XQv;
import com.instagram.debug.devoptions.apiperf.MemoryLeakBridge;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import com.instagram.debug.devoptions.debughead.data.delegates.MemoryLeakDelegate;
import java.util.Collection;

public class MemoryLeakHelper implements MemoryLeakBridge {
    public static MemoryLeakHelper sInstance;
    public MemoryLeakDelegate mDelegate;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.MemoryLeakHelper] */
    public static synchronized MemoryLeakHelper getInstance() {
        MemoryLeakHelper memoryLeakHelper;
        synchronized (MemoryLeakHelper.class) {
            MemoryLeakHelper memoryLeakHelper2 = sInstance;
            memoryLeakHelper = memoryLeakHelper2;
            if (memoryLeakHelper2 == null) {
                ? obj = new Object();
                sInstance = obj;
                memoryLeakHelper = obj;
            }
        }
        return memoryLeakHelper;
    }

    public boolean isEnabled() {
        if (this.mDelegate == null || !DebugHeadConfigurations.isMemoryLeakDetectionEnabled) {
            return false;
        }
        return true;
    }

    public void onHeapAnalysisProgress(C21250XQv xQv) {
        this.mDelegate.onHeapAnalysisProgress(xQv);
    }

    public void onLeaksDetected(Collection collection) {
        this.mDelegate.onLeaksDetected(collection);
    }

    public void onHeapAnalyzed(Object obj) {
    }

    public void setDelegate(MemoryLeakDelegate memoryLeakDelegate) {
        this.mDelegate = memoryLeakDelegate;
    }
}
