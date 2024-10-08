package com.instagram.debug.network;

import X.0lg;
import X.0tS;
import X.DbT;
import X.DbY;
import java.lang.ref.WeakReference;

public final class DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount = -1;
    public final int failNetworkRequestProbability = 1;
    public final WeakReference sessionRef;

    public int getFailNetworkRequestAfterBytesCount() {
        return this.failNetworkRequestAfterBytesCount;
    }

    public int getFailNetworkRequestProbability() {
        return this.failNetworkRequestProbability;
    }

    public final WeakReference getSessionRef() {
        return this.sessionRef;
    }

    public long getSleepTimePerChunk() {
        0lg r0 = (0lg) this.sessionRef.get();
        if (r0 != null) {
            long sleepPerChunkOverride = DebugNetworkShapingServerOverrideHelper.getSleepPerChunkOverride(r0);
            if (sleepPerChunkOverride != 0) {
                return sleepPerChunkOverride;
            }
        }
        0tS A0h = DbT.A0h();
        return (long) DbY.A03(A0h, A0h.A0o, 0tS.A4G, 139);
    }

    public DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(0lg r2) {
        this.sessionRef = new WeakReference(r2);
    }
}
