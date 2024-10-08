package com.facebook.proxygen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;

public class ConnQuality {
    public final long mCwnd;
    public final long mMss;
    public final long mRtt;
    public final long mRtx;
    public final long mTotalBytesWritten;
    public final long mTotalPackets;
    public final long mTotalPacketsLost;
    public final long mUploadLatency;
    public final long mUpstreamLatency;

    public ConnQuality(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.mRtt = j;
        this.mRtx = j2;
        this.mCwnd = j3;
        this.mMss = j4;
        this.mTotalBytesWritten = j5;
        this.mTotalPackets = j6;
        this.mTotalPacketsLost = j7;
        this.mUpstreamLatency = j8;
        this.mUploadLatency = j9;
    }

    public long getCwnd() {
        return this.mCwnd;
    }

    public long getMss() {
        return this.mMss;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public long getRtx() {
        return this.mRtx;
    }

    public long getTotalBytesWritten() {
        return this.mTotalBytesWritten;
    }

    public long getTotalPackets() {
        return this.mTotalPackets;
    }

    public long getTotalPacketsLost() {
        return this.mTotalPacketsLost;
    }

    public long getUploadLatency() {
        return this.mUploadLatency;
    }

    public long getUpstreamLatency() {
        return this.mUpstreamLatency;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{\"rtt\":");
        A1A.append(this.mRtt);
        A1A.append(",\"rtx\":");
        A1A.append(this.mRtx);
        A1A.append(",\"cwnd\":");
        A1A.append(this.mCwnd);
        A1A.append(",\"mss\":");
        A1A.append(this.mMss);
        A1A.append(",\"tbw\":");
        A1A.append(this.mTotalBytesWritten);
        A1A.append(",\"tp\":");
        A1A.append(this.mTotalPackets);
        A1A.append(",\"tpl\":");
        A1A.append(this.mTotalPacketsLost);
        A1A.append(",\"uplat\":");
        A1A.append(this.mUpstreamLatency);
        A1A.append(",\"ullat\":");
        A1A.append(this.mUploadLatency);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
