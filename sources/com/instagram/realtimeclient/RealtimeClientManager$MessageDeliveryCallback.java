package com.instagram.realtimeclient;

import X.C254403sQ;

public abstract class RealtimeClientManager$MessageDeliveryCallback {
    public long mStartSendingTimestampInMs;

    public abstract void onFailure(Integer num, String str, String str2, boolean z, C254403sQ r5, String str3, boolean z2, boolean z3);

    public abstract void onSuccess(String str, String str2, long j, Long l);

    public abstract void onTimeout();

    public long getStartSendingTimestampInMs() {
        return this.mStartSendingTimestampInMs;
    }

    public void setStartSendingTimestampInMs(long j) {
        this.mStartSendingTimestampInMs = j;
    }
}
