package com.facebook.rsys.grid.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;

public class GridGroupOptions {
    public static 2LV CONVERTER = C22180Xwq.A00(53);
    public static long sMcfTypeId;
    public final String representativeParticipantId;

    public static native GridGroupOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridGroupOptions)) {
                return false;
            }
            String str = this.representativeParticipantId;
            String str2 = ((GridGroupOptions) obj).representativeParticipantId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0E(this.representativeParticipantId);
    }

    public String toString() {
        return 002.A0g("GridGroupOptions{representativeParticipantId=", this.representativeParticipantId, "}");
    }

    public GridGroupOptions(String str) {
        this.representativeParticipantId = str;
    }
}
