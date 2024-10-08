package com.facebook.rsys.moderator.gen;

import X.002;
import X.2LV;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class ModeratorActionInfo {
    public static 2LV CONVERTER = C71546Omh.A00(61);
    public static long sMcfTypeId;
    public final String issuedByUserId;
    public final String uuid;

    public static native ModeratorActionInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorActionInfo)) {
            return false;
        }
        ModeratorActionInfo moderatorActionInfo = (ModeratorActionInfo) obj;
        return this.uuid.equals(moderatorActionInfo.uuid) && this.issuedByUserId.equals(moderatorActionInfo.issuedByUserId);
    }

    public int hashCode() {
        return C41845B3m.A01(this.issuedByUserId, C66583MXo.A06(this.uuid));
    }

    public String toString() {
        return 002.A11("ModeratorActionInfo{uuid=", this.uuid, ",issuedByUserId=", this.issuedByUserId, "}");
    }

    public ModeratorActionInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.issuedByUserId = str2;
    }
}
