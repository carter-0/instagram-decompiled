package com.facebook.rsys.livevideo.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;

public class LiveVideoEndParameters {
    public static 2LV CONVERTER = C22180Xwq.A00(61);
    public static long sMcfTypeId;
    public final String funnelSessionId;

    public static native LiveVideoEndParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVideoEndParameters)) {
            return false;
        }
        return this.funnelSessionId.equals(((LiveVideoEndParameters) obj).funnelSessionId);
    }

    public int hashCode() {
        return 527 + this.funnelSessionId.hashCode();
    }

    public String toString() {
        return 002.A0g("LiveVideoEndParameters{funnelSessionId=", this.funnelSessionId, "}");
    }

    public LiveVideoEndParameters(String str) {
        str.getClass();
        this.funnelSessionId = str;
    }
}
