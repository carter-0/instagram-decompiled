package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;

public class ScreenShareStats {
    public static 2LV CONVERTER = C22181Xwr.A00(2);
    public static long sMcfTypeId;
    public final Integer contentType;

    public static native ScreenShareStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareStats)) {
                return false;
            }
            Integer num = this.contentType;
            Integer num2 = ((ScreenShareStats) obj).contentType;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0C(this.contentType);
    }

    public ScreenShareStats(Integer num) {
        this.contentType = num;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScreenShareStats{contentType=");
        return C66582MXn.A0v(this.contentType, A1A);
    }
}
