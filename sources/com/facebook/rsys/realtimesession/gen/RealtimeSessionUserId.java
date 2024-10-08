package com.facebook.rsys.realtimesession.gen;

import X.002;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class RealtimeSessionUserId {
    public final long nodeId;
    public final long userId;

    public static native RealtimeSessionUserId createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSessionUserId)) {
            return false;
        }
        RealtimeSessionUserId realtimeSessionUserId = (RealtimeSessionUserId) obj;
        return this.userId == realtimeSessionUserId.userId && this.nodeId == realtimeSessionUserId.nodeId;
    }

    public final int hashCode() {
        long j = this.userId;
        int A01 = C66583MXo.A01((int) (j ^ (j >>> 32)));
        long j2 = this.nodeId;
        return A01 + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return 002.A0t("RealtimeSessionUserId{userId=", ",nodeId=", "}", this.userId, this.nodeId);
    }

    public RealtimeSessionUserId(long j, long j2) {
        this.userId = j;
        this.nodeId = j2;
    }
}
