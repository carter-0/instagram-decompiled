package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class ModeratorShimAudioModel {
    public static 2LV CONVERTER = C22181Xwr.A00(16);
    public static long sMcfTypeId;
    public final String actionUuid;
    public final boolean audioOn;

    public static native ModeratorShimAudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorShimAudioModel)) {
            return false;
        }
        ModeratorShimAudioModel moderatorShimAudioModel = (ModeratorShimAudioModel) obj;
        return this.actionUuid.equals(moderatorShimAudioModel.actionUuid) && this.audioOn == moderatorShimAudioModel.audioOn;
    }

    public int hashCode() {
        return C66583MXo.A06(this.actionUuid) + (this.audioOn ? 1 : 0);
    }

    public ModeratorShimAudioModel(String str, boolean z) {
        str.getClass();
        this.actionUuid = str;
        this.audioOn = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModeratorShimAudioModel{actionUuid=");
        A1A.append(this.actionUuid);
        A1A.append(",audioOn=");
        return C66584MXp.A0b(A1A, this.audioOn);
    }
}
