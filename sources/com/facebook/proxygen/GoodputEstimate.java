package com.facebook.proxygen;

import X.AnonymousClass7TE;

public class GoodputEstimate {
    public final long achievableBps;
    public final long cdfMsSinceLastUpdated;
    public final long cdfSamplesSinceInit;
    public final String cdfSrc;
    public final long ctmNumKnobFrameErrors;
    public final long ctmNumKnobFramesReceived;
    public final long ctmNumSocketObserversAttached;
    public boolean isMaximumAchievableBps;
    public final Long minRttUs;

    public long getAchievableBps() {
        return this.achievableBps;
    }

    public long getCdfMsSinceLastUpdated() {
        return this.cdfMsSinceLastUpdated;
    }

    public long getCdfSamplesSinceInit() {
        return this.cdfSamplesSinceInit;
    }

    public String getCdfSrc() {
        return this.cdfSrc;
    }

    public long getCtmNumKnobFrameErrors() {
        return this.ctmNumKnobFrameErrors;
    }

    public long getCtmNumKnobFramesReceived() {
        return this.ctmNumKnobFramesReceived;
    }

    public long getCtmNumSocketObserversAttached() {
        return this.ctmNumSocketObserversAttached;
    }

    public Long getMinRttUs() {
        return this.minRttUs;
    }

    public boolean isMaximumAchievableBps() {
        return this.isMaximumAchievableBps;
    }

    public GoodputEstimate(long j, boolean z, Long l, String str, long j2, long j3, long j4, long j5, long j6) {
        this.achievableBps = j;
        this.isMaximumAchievableBps = z;
        this.minRttUs = l;
        this.cdfSrc = str;
        this.cdfMsSinceLastUpdated = j2;
        this.cdfSamplesSinceInit = j3;
        this.ctmNumKnobFramesReceived = j4;
        this.ctmNumKnobFrameErrors = j5;
        this.ctmNumSocketObserversAttached = j6;
    }

    public String getDebugString(boolean z) {
        long longValue;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (z) {
            A1A.append("achievableBps=");
            A1A.append(this.achievableBps);
            A1A.append(",isMaximumAchievableBps=");
            A1A.append(this.isMaximumAchievableBps ? 1 : 0);
            A1A.append(",minRttUs=");
            Long l = this.minRttUs;
            if (l == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            A1A.append(longValue);
            A1A.append(",");
        }
        A1A.append("cdfSrc=");
        A1A.append(this.cdfSrc);
        A1A.append(",cdfMsSinceLastUpdated=");
        A1A.append(this.cdfMsSinceLastUpdated);
        A1A.append(",cdfSamplesSinceInit=");
        A1A.append(this.cdfSamplesSinceInit);
        A1A.append(",ctmNumKnobFramesReceived=");
        A1A.append(this.ctmNumKnobFramesReceived);
        A1A.append(",ctmNumKnobFrameErrors=");
        A1A.append(this.ctmNumKnobFrameErrors);
        A1A.append(",ctmNumSocketObserversAttached=");
        A1A.append(this.ctmNumSocketObserversAttached);
        return A1A.toString();
    }

    public String getMiniDebugString() {
        long longValue;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("s=");
        A1A.append(this.cdfSrc);
        A1A.append(",mrttus=");
        Long l = this.minRttUs;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        A1A.append(longValue);
        A1A.append(",mslu=");
        A1A.append(this.cdfMsSinceLastUpdated);
        A1A.append(",ssi=");
        A1A.append(this.cdfSamplesSinceInit);
        A1A.append(",nkfr=");
        A1A.append(this.ctmNumKnobFramesReceived);
        A1A.append(",nkfe=");
        A1A.append(this.ctmNumKnobFrameErrors);
        A1A.append(",nsoa=");
        A1A.append(this.ctmNumSocketObserversAttached);
        return A1A.toString();
    }

    public String getDebugString() {
        return getDebugString(false);
    }
}
