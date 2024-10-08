package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplayPayload {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayPayload createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplayPayload)) {
            return false;
        }
        CowatchAutoplayPayload cowatchAutoplayPayload = (CowatchAutoplayPayload) obj;
        return this.mediaId.equals(cowatchAutoplayPayload.mediaId) && this.mediaSource.equals(cowatchAutoplayPayload.mediaSource) && this.previewDurationMs == cowatchAutoplayPayload.previewDurationMs && this.sourceMediaId.equals(cowatchAutoplayPayload.sourceMediaId) && this.sourceMediaSource.equals(cowatchAutoplayPayload.sourceMediaSource);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.sourceMediaSource, AnonymousClass7TF.A08(this.sourceMediaId, AnonymousClass7TF.A01(this.previewDurationMs, AnonymousClass7TF.A08(this.mediaSource, (527 + this.mediaId.hashCode()) * 31))));
    }

    public CowatchAutoplayPayload(String str, String str2, long j, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
        this.sourceMediaId = str3;
        this.sourceMediaSource = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAutoplayPayload{mediaId=");
        A1A.append(this.mediaId);
        A1A.append(",mediaSource=");
        A1A.append(this.mediaSource);
        A1A.append(",previewDurationMs=");
        A1A.append(this.previewDurationMs);
        A1A.append(",sourceMediaId=");
        A1A.append(this.sourceMediaId);
        A1A.append(",sourceMediaSource=");
        A1A.append(this.sourceMediaSource);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
