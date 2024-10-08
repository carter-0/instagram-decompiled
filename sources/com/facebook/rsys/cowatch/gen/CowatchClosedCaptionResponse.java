package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchClosedCaptionResponse {
    public final long endTime;
    public final long startTime;
    public final String text;

    public static native CowatchClosedCaptionResponse createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchClosedCaptionResponse)) {
            return false;
        }
        CowatchClosedCaptionResponse cowatchClosedCaptionResponse = (CowatchClosedCaptionResponse) obj;
        return this.startTime == cowatchClosedCaptionResponse.startTime && this.endTime == cowatchClosedCaptionResponse.endTime && this.text.equals(cowatchClosedCaptionResponse.text);
    }

    public final int hashCode() {
        long j = this.startTime;
        int A01 = C66583MXo.A01((int) (j ^ (j >>> 32)));
        long j2 = this.endTime;
        return ((A01 + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.text.hashCode();
    }

    public CowatchClosedCaptionResponse(long j, long j2, String str) {
        str.getClass();
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchClosedCaptionResponse{startTime=");
        A1A.append(this.startTime);
        A1A.append(",endTime=");
        A1A.append(this.endTime);
        A1A.append(",text=");
        return C66584MXp.A0a(this.text, A1A);
    }
}
