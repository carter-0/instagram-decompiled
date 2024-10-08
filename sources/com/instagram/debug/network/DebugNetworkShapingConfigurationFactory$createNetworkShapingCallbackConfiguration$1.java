package com.instagram.debug.network;

public final class DebugNetworkShapingConfigurationFactory$createNetworkShapingCallbackConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount = -1;
    public final int failNetworkRequestProbability = 1;
    public final long sleepTimePerChunk;

    public int getFailNetworkRequestAfterBytesCount() {
        return this.failNetworkRequestAfterBytesCount;
    }

    public int getFailNetworkRequestProbability() {
        return this.failNetworkRequestProbability;
    }

    public long getSleepTimePerChunk() {
        return this.sleepTimePerChunk;
    }
}
