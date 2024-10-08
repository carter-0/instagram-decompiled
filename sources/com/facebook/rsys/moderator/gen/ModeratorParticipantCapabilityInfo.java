package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class ModeratorParticipantCapabilityInfo {
    public static 2LV CONVERTER = C71546Omh.A00(62);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final boolean isModerator;

    public static native ModeratorParticipantCapabilityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorParticipantCapabilityInfo)) {
            return false;
        }
        ModeratorParticipantCapabilityInfo moderatorParticipantCapabilityInfo = (ModeratorParticipantCapabilityInfo) obj;
        return this.isModerator == moderatorParticipantCapabilityInfo.isModerator && this.actionCapabilitiesAsModerator == moderatorParticipantCapabilityInfo.actionCapabilitiesAsModerator && this.actionCapabilitiesAsParticipant == moderatorParticipantCapabilityInfo.actionCapabilitiesAsParticipant;
    }

    public int hashCode() {
        return ((C66583MXo.A01(this.isModerator ? 1 : 0) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0);
    }

    public ModeratorParticipantCapabilityInfo(boolean z, boolean z2, boolean z3) {
        this.isModerator = z;
        this.actionCapabilitiesAsModerator = z2;
        this.actionCapabilitiesAsParticipant = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModeratorParticipantCapabilityInfo{isModerator=");
        A1A.append(this.isModerator);
        A1A.append(",actionCapabilitiesAsModerator=");
        A1A.append(this.actionCapabilitiesAsModerator);
        A1A.append(",actionCapabilitiesAsParticipant=");
        return C66584MXp.A0b(A1A, this.actionCapabilitiesAsParticipant);
    }
}
