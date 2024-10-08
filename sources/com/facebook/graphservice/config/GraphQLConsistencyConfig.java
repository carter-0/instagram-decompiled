package com.facebook.graphservice.config;

import X.C21310XUu;
import X.XT3;

public class GraphQLConsistencyConfig {
    public boolean disableGBNS;
    public boolean disableQueueHealthCheck;
    public boolean enableBlackboxConsistencyService;
    public boolean enableGlobalFullConsistency;
    public int minFlushesToSkip;
    public int prunePersistentStoreStrategy;
    public int queueHealthCheckInterval;
    public int writeBufferColdAge;
    public int writeBufferMandatoryFlushAge;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XUu] */
    public static C21310XUu Builder() {
        return new Object();
    }

    public boolean disableGBNS() {
        return this.disableGBNS;
    }

    public boolean disableQueueHealthCheck() {
        return this.disableQueueHealthCheck;
    }

    public boolean enableGlobalFullConsistency() {
        return this.enableGlobalFullConsistency;
    }

    public int getMinFlushesToSkip() {
        return this.minFlushesToSkip;
    }

    public int getWriteBufferColdAge() {
        return this.writeBufferColdAge;
    }

    public int getWriteBufferMandatoryFlushAge() {
        return this.writeBufferMandatoryFlushAge;
    }

    public boolean isEnableBlackboxConsistencyService() {
        return this.enableBlackboxConsistencyService;
    }

    public int prunePersistentStoreStrategy() {
        return this.prunePersistentStoreStrategy;
    }

    public int queueHealthCheckInterval() {
        return this.queueHealthCheckInterval;
    }

    public /* synthetic */ GraphQLConsistencyConfig(XT3 xt3) {
    }

    public GraphQLConsistencyConfig() {
    }
}
