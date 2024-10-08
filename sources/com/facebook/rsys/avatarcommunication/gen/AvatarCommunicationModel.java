package com.facebook.rsys.avatarcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class AvatarCommunicationModel {
    public static 2LV CONVERTER = C22180Xwq.A00(11);
    public static long sMcfTypeId;
    public final int avatarsLoadState;
    public final boolean avatarsUsedInCall;
    public final boolean codecAvatarStreamed;
    public final boolean eligibleForAvatarPostCallMimicryUpsell;
    public final boolean usingAvatars;

    public static native AvatarCommunicationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarCommunicationModel)) {
            return false;
        }
        AvatarCommunicationModel avatarCommunicationModel = (AvatarCommunicationModel) obj;
        return this.avatarsUsedInCall == avatarCommunicationModel.avatarsUsedInCall && this.usingAvatars == avatarCommunicationModel.usingAvatars && this.avatarsLoadState == avatarCommunicationModel.avatarsLoadState && this.eligibleForAvatarPostCallMimicryUpsell == avatarCommunicationModel.eligibleForAvatarPostCallMimicryUpsell && this.codecAvatarStreamed == avatarCommunicationModel.codecAvatarStreamed;
    }

    public int hashCode() {
        return ((((((C66583MXo.A01(this.avatarsUsedInCall ? 1 : 0) + (this.usingAvatars ? 1 : 0)) * 31) + this.avatarsLoadState) * 31) + (this.eligibleForAvatarPostCallMimicryUpsell ? 1 : 0)) * 31) + (this.codecAvatarStreamed ? 1 : 0);
    }

    public AvatarCommunicationModel(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.avatarsUsedInCall = z;
        this.usingAvatars = z2;
        this.avatarsLoadState = i;
        this.eligibleForAvatarPostCallMimicryUpsell = z3;
        this.codecAvatarStreamed = z4;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvatarCommunicationModel{avatarsUsedInCall=");
        A1A.append(this.avatarsUsedInCall);
        A1A.append(",usingAvatars=");
        A1A.append(this.usingAvatars);
        A1A.append(",avatarsLoadState=");
        A1A.append(this.avatarsLoadState);
        A1A.append(",eligibleForAvatarPostCallMimicryUpsell=");
        A1A.append(this.eligibleForAvatarPostCallMimicryUpsell);
        A1A.append(",codecAvatarStreamed=");
        return C66584MXp.A0b(A1A, this.codecAvatarStreamed);
    }
}
