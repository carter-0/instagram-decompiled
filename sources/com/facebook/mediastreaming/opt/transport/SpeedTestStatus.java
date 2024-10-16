package com.facebook.mediastreaming.opt.transport;

import X.0oU;

public final class SpeedTestStatus {
    public final double bandwidth;
    public final boolean speedTestPassesThreshold;
    public final Status state;
    public final long timeTaken;

    public enum Status {
        Failed,
        Succeeded,
        Canceled;

        /* access modifiers changed from: public */
        static {
            Status[] statusArr;
            A00 = 0oU.A00(statusArr);
        }
    }

    public SpeedTestStatus(int i, double d, long j, boolean z) {
        this.bandwidth = d;
        this.timeTaken = j;
        this.speedTestPassesThreshold = z;
        this.state = Status.values()[i];
    }
}
