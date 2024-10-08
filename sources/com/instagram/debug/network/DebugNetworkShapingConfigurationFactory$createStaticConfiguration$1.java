package com.instagram.debug.network;

public final class DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount;
    public final int failNetworkRequestProbability;
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

    public DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1(long j, int i, int i2) {
        this.sleepTimePerChunk = j;
        this.failNetworkRequestAfterBytesCount = i;
        this.failNetworkRequestProbability = i2;
    }
}
