package com.facebook.rsys.rooms.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomCapabilityModel {
    public static 2LV CONVERTER = C22181Xwr.A00(51);
    public static long sMcfTypeId;
    public final boolean isAutoJoinDisabled;
    public final boolean isIncallAudienceExpansionEnabled;

    public static native RoomCapabilityModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomCapabilityModel)) {
            return false;
        }
        RoomCapabilityModel roomCapabilityModel = (RoomCapabilityModel) obj;
        return this.isIncallAudienceExpansionEnabled == roomCapabilityModel.isIncallAudienceExpansionEnabled && this.isAutoJoinDisabled == roomCapabilityModel.isAutoJoinDisabled;
    }

    public int hashCode() {
        return C66583MXo.A01(this.isIncallAudienceExpansionEnabled ? 1 : 0) + (this.isAutoJoinDisabled ? 1 : 0);
    }

    public RoomCapabilityModel(boolean z, boolean z2) {
        this.isIncallAudienceExpansionEnabled = z;
        this.isAutoJoinDisabled = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomCapabilityModel{isIncallAudienceExpansionEnabled=");
        A1A.append(this.isIncallAudienceExpansionEnabled);
        A1A.append(",isAutoJoinDisabled=");
        return C66584MXp.A0b(A1A, this.isAutoJoinDisabled);
    }
}
