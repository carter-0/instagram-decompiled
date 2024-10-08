package com.facebook.rsys.rooms.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

public class RoomResolveConfig {
    public static 2LV CONVERTER = C22181Xwr.A00(54);
    public static long sMcfTypeId;
    public final boolean attemptRetry;
    public final Integer expectedParticipantCount;
    public final boolean isAudioOnly;
    public final String localCallId;
    public final boolean shouldAutoJoin;
    public final UserProfile userToRing;
    public final Long visibleId;

    public static native RoomResolveConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomResolveConfig)) {
                return false;
            }
            RoomResolveConfig roomResolveConfig = (RoomResolveConfig) obj;
            if (!this.localCallId.equals(roomResolveConfig.localCallId) || this.shouldAutoJoin != roomResolveConfig.shouldAutoJoin) {
                return false;
            }
            UserProfile userProfile = this.userToRing;
            UserProfile userProfile2 = roomResolveConfig.userToRing;
            if (userProfile == null) {
                if (userProfile2 != null) {
                    return false;
                }
            } else if (!userProfile.equals(userProfile2)) {
                return false;
            }
            Integer num = this.expectedParticipantCount;
            Integer num2 = roomResolveConfig.expectedParticipantCount;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            if (this.isAudioOnly != roomResolveConfig.isAudioOnly) {
                return false;
            }
            Long l = this.visibleId;
            Long l2 = roomResolveConfig.visibleId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            return this.attemptRetry == roomResolveConfig.attemptRetry;
        }
    }

    public int hashCode() {
        return ((((((((((C66583MXo.A06(this.localCallId) + (this.shouldAutoJoin ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.userToRing)) * 31) + AnonymousClass7TG.A0C(this.expectedParticipantCount)) * 31) + (this.isAudioOnly ? 1 : 0)) * 31) + AnonymousClass7TE.A0L(this.visibleId)) * 31) + (this.attemptRetry ? 1 : 0);
    }

    public RoomResolveConfig(String str, boolean z, UserProfile userProfile, Integer num, boolean z2, Long l, boolean z3) {
        str.getClass();
        this.localCallId = str;
        this.shouldAutoJoin = z;
        this.userToRing = userProfile;
        this.expectedParticipantCount = num;
        this.isAudioOnly = z2;
        this.visibleId = l;
        this.attemptRetry = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomResolveConfig{localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",shouldAutoJoin=");
        A1A.append(this.shouldAutoJoin);
        A1A.append(",userToRing=");
        A1A.append(this.userToRing);
        A1A.append(",expectedParticipantCount=");
        A1A.append(this.expectedParticipantCount);
        A1A.append(",isAudioOnly=");
        A1A.append(this.isAudioOnly);
        A1A.append(",visibleId=");
        A1A.append(this.visibleId);
        A1A.append(",attemptRetry=");
        return C66584MXp.A0b(A1A, this.attemptRetry);
    }
}
