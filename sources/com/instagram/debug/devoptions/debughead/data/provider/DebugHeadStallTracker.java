package com.instagram.debug.devoptions.debughead.data.provider;

import X.0qQ;
import android.os.SystemClock;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;

public final class DebugHeadStallTracker {
    public final long INVALID;
    public final int NUM_STALLS = 3;
    public int stallCount;
    public final long[] startStallTimeStamps = new long[3];
    public long totalStallTime;
    public final long[] totalStallTimes = new long[3];
    public boolean videoStarted;

    public final void endStall(VideoPerformanceProvider.Stalls stalls) {
        0qQ.A0B(stalls, 0);
        long[] jArr = this.startStallTimeStamps;
        int ordinal = stalls.ordinal();
        long j = jArr[ordinal];
        if (j > 0) {
            this.videoStarted = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.totalStallTime += elapsedRealtime;
            long[] jArr2 = this.totalStallTimes;
            jArr2[ordinal] = jArr2[ordinal] + elapsedRealtime;
            jArr[ordinal] = this.INVALID;
            this.stallCount++;
        }
    }

    public final void startStall(VideoPerformanceProvider.Stalls stalls) {
        0qQ.A0B(stalls, 0);
        if (stalls != VideoPerformanceProvider.Stalls.BUFFERING || this.videoStarted) {
            long[] jArr = this.startStallTimeStamps;
            int ordinal = stalls.ordinal();
            if (jArr[ordinal] == this.INVALID) {
                jArr[ordinal] = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void reset() {
        this.totalStallTime = 0;
        this.stallCount = 0;
        this.videoStarted = false;
        int i = this.NUM_STALLS;
        for (int i2 = 0; i2 < i; i2++) {
            this.startStallTimeStamps[i2] = this.INVALID;
            this.totalStallTimes[i2] = 0;
        }
    }

    public final int getStallCount() {
        return this.stallCount;
    }

    public final long getTotalStallTime() {
        return this.totalStallTime;
    }

    public final long[] getTotalStallTimes() {
        return this.totalStallTimes;
    }

    public final void setStallCount(int i) {
        this.stallCount = i;
    }

    public final void setTotalStallTime(long j) {
        this.totalStallTime = j;
    }
}
