package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class ActionMetadata {
    public static 2LV CONVERTER = C71546Omh.A00(47);
    public static long sMcfTypeId;
    public final long actionTimeMs;
    public final Integer carouselItemIndex;
    public final long mediaPositionMs;

    public static native ActionMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ActionMetadata)) {
                return false;
            }
            ActionMetadata actionMetadata = (ActionMetadata) obj;
            if (this.actionTimeMs != actionMetadata.actionTimeMs || this.mediaPositionMs != actionMetadata.mediaPositionMs) {
                return false;
            }
            Integer num = this.carouselItemIndex;
            Integer num2 = actionMetadata.carouselItemIndex;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        long j = this.actionTimeMs;
        int A01 = C66583MXo.A01((int) (j ^ (j >>> 32)));
        long j2 = this.mediaPositionMs;
        return ((A01 + ((int) ((j2 >>> 32) ^ j2))) * 31) + AnonymousClass7TG.A0C(this.carouselItemIndex);
    }

    public ActionMetadata(long j, long j2, Integer num) {
        this.actionTimeMs = j;
        this.mediaPositionMs = j2;
        this.carouselItemIndex = num;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ActionMetadata{actionTimeMs=");
        A1A.append(this.actionTimeMs);
        A1A.append(",mediaPositionMs=");
        A1A.append(this.mediaPositionMs);
        A1A.append(",carouselItemIndex=");
        return C66582MXn.A0v(this.carouselItemIndex, A1A);
    }
}
