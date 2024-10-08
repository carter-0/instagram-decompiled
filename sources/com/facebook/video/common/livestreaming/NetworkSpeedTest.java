package com.facebook.video.common.livestreaming;

import X.0oU;

public final class NetworkSpeedTest {
    public final double bandwidth;
    public final boolean speedTestPassesThreshold;
    public final Status state;
    public final long timeTaken;

    public enum Status {
        Failed,
        Succeeded,
        Canceled,
        Ignored;

        /* access modifiers changed from: public */
        static {
            Status[] statusArr;
            A00 = 0oU.A00(statusArr);
        }
    }

    public NetworkSpeedTest(int i, double d, long j, boolean z) {
        this.bandwidth = d;
        this.timeTaken = j;
        this.speedTestPassesThreshold = z;
        this.state = Status.values()[i];
    }
}
