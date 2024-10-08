package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22179Xwp;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.mediastats.gen.MediaStats;

public class IGMediaStats {
    public static 2LV CONVERTER = new C22179Xwp(25);
    public static long sMcfTypeId;
    public final MediaStats mediaStats;
    public final String userId;

    public static native IGMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IGMediaStats)) {
            return false;
        }
        IGMediaStats iGMediaStats = (IGMediaStats) obj;
        return this.userId.equals(iGMediaStats.userId) && this.mediaStats.equals(iGMediaStats.mediaStats);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.mediaStats, C66583MXo.A06(this.userId));
    }

    public IGMediaStats(String str, MediaStats mediaStats2) {
        str.getClass();
        mediaStats2.getClass();
        this.userId = str;
        this.mediaStats = mediaStats2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IGMediaStats{userId=");
        A1A.append(this.userId);
        A1A.append(",mediaStats=");
        return C66582MXn.A0v(this.mediaStats, A1A);
    }
}
