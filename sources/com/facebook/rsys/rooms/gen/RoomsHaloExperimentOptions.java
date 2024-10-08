package com.facebook.rsys.rooms.gen;

import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomsHaloExperimentOptions {
    public final boolean enableRoomsUiForGvcLink;
    public final boolean shouldEnableGVCLinkCallExperience;

    public static native RoomsHaloExperimentOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomsHaloExperimentOptions)) {
            return false;
        }
        RoomsHaloExperimentOptions roomsHaloExperimentOptions = (RoomsHaloExperimentOptions) obj;
        return this.enableRoomsUiForGvcLink == roomsHaloExperimentOptions.enableRoomsUiForGvcLink && this.shouldEnableGVCLinkCallExperience == roomsHaloExperimentOptions.shouldEnableGVCLinkCallExperience;
    }

    public final int hashCode() {
        return C66583MXo.A01(this.enableRoomsUiForGvcLink ? 1 : 0) + (this.shouldEnableGVCLinkCallExperience ? 1 : 0);
    }

    public RoomsHaloExperimentOptions(boolean z, boolean z2) {
        this.enableRoomsUiForGvcLink = z;
        this.shouldEnableGVCLinkCallExperience = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomsHaloExperimentOptions{enableRoomsUiForGvcLink=");
        A1A.append(this.enableRoomsUiForGvcLink);
        A1A.append(",shouldEnableGVCLinkCallExperience=");
        return C66584MXp.A0b(A1A, this.shouldEnableGVCLinkCallExperience);
    }
}
