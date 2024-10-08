package com.facebook.rsys.call.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

public class CallParticipant {
    public static 2LV CONVERTER = C71546Omh.A00(13);
    public static long sMcfTypeId;
    public final String aliasId;
    public final boolean isCaller;
    public final ParticipantMediaState mediaState;
    public final String representativeId;
    public final Long sctpNodeId;
    public final int state;
    public final String userId;
    public final UserProfile userProfile;
    public final String username;

    public static native CallParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallParticipant)) {
                return false;
            }
            CallParticipant callParticipant = (CallParticipant) obj;
            if (!this.userId.equals(callParticipant.userId)) {
                return false;
            }
            String str = this.representativeId;
            String str2 = callParticipant.representativeId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.aliasId;
            String str4 = callParticipant.aliasId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.username;
            String str6 = callParticipant.username;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.userProfile.equals(callParticipant.userProfile) || this.isCaller != callParticipant.isCaller || !this.mediaState.equals(callParticipant.mediaState) || this.state != callParticipant.state) {
                return false;
            }
            Long l = this.sctpNodeId;
            Long l2 = callParticipant.sctpNodeId;
            if (l != null) {
                return l.equals(l2);
            }
            if (l2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        UserProfile userProfile2 = this.userProfile;
        return ((AnonymousClass7TF.A07(this.mediaState, (AnonymousClass7TF.A07(userProfile2, (((((C66583MXo.A06(this.userId) + AnonymousClass7TG.A0E(this.representativeId)) * 31) + AnonymousClass7TG.A0E(this.aliasId)) * 31) + AnonymousClass7TG.A0E(this.username)) * 31) + (this.isCaller ? 1 : 0)) * 31) + this.state) * 31) + AnonymousClass7TE.A0L(this.sctpNodeId);
    }

    public CallParticipant(String str, String str2, String str3, String str4, UserProfile userProfile2, boolean z, ParticipantMediaState participantMediaState, int i, Long l) {
        C66581MXm.A1R(str, userProfile2, participantMediaState);
        this.userId = str;
        this.representativeId = str2;
        this.aliasId = str3;
        this.username = str4;
        this.userProfile = userProfile2;
        this.isCaller = z;
        this.mediaState = participantMediaState;
        this.state = i;
        this.sctpNodeId = l;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallParticipant{userId=");
        A1A.append(this.userId);
        A1A.append(",representativeId=");
        A1A.append(this.representativeId);
        A1A.append(",aliasId=");
        A1A.append(this.aliasId);
        A1A.append(",username=");
        A1A.append(this.username);
        A1A.append(",userProfile=");
        A1A.append(this.userProfile);
        A1A.append(",isCaller=");
        A1A.append(this.isCaller);
        A1A.append(",mediaState=");
        A1A.append(this.mediaState);
        A1A.append(",state=");
        A1A.append(this.state);
        A1A.append(",sctpNodeId=");
        return C66582MXn.A0v(this.sctpNodeId, A1A);
    }
}
