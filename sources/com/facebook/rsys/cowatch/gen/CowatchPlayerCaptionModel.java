package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPlayerCaptionModel {
    public final String captionText;
    public final long endTimeMs;
    public final long startTimeMs;

    public static native CowatchPlayerCaptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionModel)) {
            return false;
        }
        CowatchPlayerCaptionModel cowatchPlayerCaptionModel = (CowatchPlayerCaptionModel) obj;
        return this.startTimeMs == cowatchPlayerCaptionModel.startTimeMs && this.endTimeMs == cowatchPlayerCaptionModel.endTimeMs && this.captionText.equals(cowatchPlayerCaptionModel.captionText);
    }

    public final int hashCode() {
        long j = this.startTimeMs;
        int A01 = C66583MXo.A01((int) (j ^ (j >>> 32)));
        long j2 = this.endTimeMs;
        return ((A01 + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.captionText.hashCode();
    }

    public CowatchPlayerCaptionModel(long j, long j2, String str) {
        str.getClass();
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.captionText = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchPlayerCaptionModel{startTimeMs=");
        A1A.append(this.startTimeMs);
        A1A.append(",endTimeMs=");
        A1A.append(this.endTimeMs);
        A1A.append(",captionText=");
        return C66584MXp.A0a(this.captionText, A1A);
    }
}
