package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPmvCounterModel {
    public final int currentCount;
    public final String lastMediaId;
    public final String lastMediaSource;
    public final boolean needsUpdatePeer;

    public static native CowatchPmvCounterModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPmvCounterModel)) {
                return false;
            }
            CowatchPmvCounterModel cowatchPmvCounterModel = (CowatchPmvCounterModel) obj;
            String str = this.lastMediaId;
            String str2 = cowatchPmvCounterModel.lastMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.lastMediaSource;
            String str4 = cowatchPmvCounterModel.lastMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.currentCount == cowatchPmvCounterModel.currentCount && this.needsUpdatePeer == cowatchPmvCounterModel.needsUpdatePeer)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((527 + AnonymousClass7TG.A0E(this.lastMediaId)) * 31) + C41845B3m.A00(this.lastMediaSource)) * 31) + this.currentCount) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public CowatchPmvCounterModel(String str, String str2, int i, boolean z) {
        this.lastMediaId = str;
        this.lastMediaSource = str2;
        this.currentCount = i;
        this.needsUpdatePeer = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchPmvCounterModel{lastMediaId=");
        A1A.append(this.lastMediaId);
        A1A.append(",lastMediaSource=");
        A1A.append(this.lastMediaSource);
        A1A.append(",currentCount=");
        A1A.append(this.currentCount);
        A1A.append(",needsUpdatePeer=");
        A1A.append(this.needsUpdatePeer);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
