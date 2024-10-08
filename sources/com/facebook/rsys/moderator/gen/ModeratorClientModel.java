package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class ModeratorClientModel {
    public static 2LV CONVERTER = C22181Xwr.A00(14);
    public static long sMcfTypeId;
    public final boolean isInitialized;
    public final boolean isModerator;
    public final boolean screenShareEnabled;
    public final String screenShareEnabledActorId;

    public static native ModeratorClientModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorClientModel)) {
                return false;
            }
            ModeratorClientModel moderatorClientModel = (ModeratorClientModel) obj;
            if (this.screenShareEnabled != moderatorClientModel.screenShareEnabled) {
                return false;
            }
            String str = this.screenShareEnabledActorId;
            String str2 = moderatorClientModel.screenShareEnabledActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.isModerator == moderatorClientModel.isModerator && this.isInitialized == moderatorClientModel.isInitialized)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C66583MXo.A01(this.screenShareEnabled ? 1 : 0) + AnonymousClass7TG.A0E(this.screenShareEnabledActorId)) * 31) + (this.isModerator ? 1 : 0)) * 31) + (this.isInitialized ? 1 : 0);
    }

    public ModeratorClientModel(boolean z, String str, boolean z2, boolean z3) {
        this.screenShareEnabled = z;
        this.screenShareEnabledActorId = str;
        this.isModerator = z2;
        this.isInitialized = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModeratorClientModel{screenShareEnabled=");
        A1A.append(this.screenShareEnabled);
        A1A.append(",screenShareEnabledActorId=");
        A1A.append(this.screenShareEnabledActorId);
        A1A.append(",isModerator=");
        A1A.append(this.isModerator);
        A1A.append(",isInitialized=");
        return C66584MXp.A0b(A1A, this.isInitialized);
    }
}
