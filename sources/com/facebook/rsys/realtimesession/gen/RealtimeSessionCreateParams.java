package com.facebook.rsys.realtimesession.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C51972G9s;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RealtimeSessionCreateParams {
    public static 2LV CONVERTER = C22181Xwr.A00(49);
    public static long sMcfTypeId;
    public final boolean e2ee;
    public final int peerMode;
    public final long peerTimeoutMs;
    public final String topic;

    public static native RealtimeSessionCreateParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSessionCreateParams)) {
            return false;
        }
        RealtimeSessionCreateParams realtimeSessionCreateParams = (RealtimeSessionCreateParams) obj;
        return this.topic.equals(realtimeSessionCreateParams.topic) && this.peerMode == realtimeSessionCreateParams.peerMode && this.peerTimeoutMs == realtimeSessionCreateParams.peerTimeoutMs && this.e2ee == realtimeSessionCreateParams.e2ee;
    }

    public int hashCode() {
        return C51972G9s.A07(this.peerTimeoutMs, (C66583MXo.A06(this.topic) + this.peerMode) * 31) + (this.e2ee ? 1 : 0);
    }

    public RealtimeSessionCreateParams(String str, int i, long j, boolean z) {
        str.getClass();
        this.topic = str;
        this.peerMode = i;
        this.peerTimeoutMs = j;
        this.e2ee = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RealtimeSessionCreateParams{topic=");
        A1A.append(this.topic);
        A1A.append(",peerMode=");
        A1A.append(this.peerMode);
        A1A.append(",peerTimeoutMs=");
        A1A.append(this.peerTimeoutMs);
        A1A.append(",e2ee=");
        return C66584MXp.A0b(A1A, this.e2ee);
    }
}
