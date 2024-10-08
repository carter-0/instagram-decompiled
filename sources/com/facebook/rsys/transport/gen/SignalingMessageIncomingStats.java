package com.facebook.rsys.transport.gen;

import X.002;
import X.2LV;
import X.C22179Xwp;
import X.C51968G9o;
import com.facebook.djinni.msys.infra.McfReference;

public class SignalingMessageIncomingStats {
    public static 2LV CONVERTER = new C22179Xwp(1);
    public static long sMcfTypeId;
    public final long receivedBytes;

    public static native SignalingMessageIncomingStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SignalingMessageIncomingStats) && this.receivedBytes == ((SignalingMessageIncomingStats) obj).receivedBytes;
        }
        return true;
    }

    public int hashCode() {
        return 527 + C51968G9o.A03(this.receivedBytes);
    }

    public String toString() {
        return 002.A0e("SignalingMessageIncomingStats{receivedBytes=", "}", this.receivedBytes);
    }

    public SignalingMessageIncomingStats(long j) {
        this.receivedBytes = j;
    }
}
