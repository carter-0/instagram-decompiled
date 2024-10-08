package com.facebook.rsys.avatarcommunication.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class AvatarCommunicationOutputModel {
    public final boolean avatarsUsedInCall;
    public final boolean usedAvatars;
    public final String userId;

    public static native AvatarCommunicationOutputModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AvatarCommunicationOutputModel)) {
                return false;
            }
            AvatarCommunicationOutputModel avatarCommunicationOutputModel = (AvatarCommunicationOutputModel) obj;
            if (this.avatarsUsedInCall != avatarCommunicationOutputModel.avatarsUsedInCall || this.usedAvatars != avatarCommunicationOutputModel.usedAvatars) {
                return false;
            }
            String str = this.userId;
            String str2 = avatarCommunicationOutputModel.userId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        return ((C66583MXo.A01(this.avatarsUsedInCall ? 1 : 0) + (this.usedAvatars ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.userId);
    }

    public AvatarCommunicationOutputModel(boolean z, boolean z2, String str) {
        this.avatarsUsedInCall = z;
        this.usedAvatars = z2;
        this.userId = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvatarCommunicationOutputModel{avatarsUsedInCall=");
        A1A.append(this.avatarsUsedInCall);
        A1A.append(",usedAvatars=");
        A1A.append(this.usedAvatars);
        A1A.append(",userId=");
        return C66584MXp.A0a(this.userId, A1A);
    }
}
