package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplaySimpleModel {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;

    public static native CowatchAutoplaySimpleModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplaySimpleModel)) {
            return false;
        }
        CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = (CowatchAutoplaySimpleModel) obj;
        return this.mediaId.equals(cowatchAutoplaySimpleModel.mediaId) && this.mediaSource.equals(cowatchAutoplaySimpleModel.mediaSource) && this.previewDurationMs == cowatchAutoplaySimpleModel.previewDurationMs;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.mediaSource, (527 + this.mediaId.hashCode()) * 31);
        long j = this.previewDurationMs;
        return A08 + ((int) (j ^ (j >>> 32)));
    }

    public CowatchAutoplaySimpleModel(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAutoplaySimpleModel{mediaId=");
        A1A.append(this.mediaId);
        A1A.append(",mediaSource=");
        A1A.append(this.mediaSource);
        A1A.append(",previewDurationMs=");
        A1A.append(this.previewDurationMs);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
