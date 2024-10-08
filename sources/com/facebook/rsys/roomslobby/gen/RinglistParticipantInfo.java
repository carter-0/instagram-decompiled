package com.facebook.rsys.roomslobby.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22181Xwr;
import X.C51972G9s;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rooms.gen.RoomParticipantInfo;

public class RinglistParticipantInfo {
    public static 2LV CONVERTER = C22181Xwr.A00(56);
    public static long sMcfTypeId;
    public final int inviteType;
    public final boolean isAttemptedJoiner;
    public final RoomParticipantInfo roomParticipantInfo;
    public final long timeSinceAttemptedJoin;

    public static native RinglistParticipantInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RinglistParticipantInfo)) {
            return false;
        }
        RinglistParticipantInfo ringlistParticipantInfo = (RinglistParticipantInfo) obj;
        return this.roomParticipantInfo.equals(ringlistParticipantInfo.roomParticipantInfo) && this.isAttemptedJoiner == ringlistParticipantInfo.isAttemptedJoiner && this.timeSinceAttemptedJoin == ringlistParticipantInfo.timeSinceAttemptedJoin && this.inviteType == ringlistParticipantInfo.inviteType;
    }

    public int hashCode() {
        return C51972G9s.A07(this.timeSinceAttemptedJoin, (C21056XCh.A01(this.roomParticipantInfo) + (this.isAttemptedJoiner ? 1 : 0)) * 31) + this.inviteType;
    }

    public RinglistParticipantInfo(RoomParticipantInfo roomParticipantInfo2, boolean z, long j, int i) {
        roomParticipantInfo2.getClass();
        this.roomParticipantInfo = roomParticipantInfo2;
        this.isAttemptedJoiner = z;
        this.timeSinceAttemptedJoin = j;
        this.inviteType = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RinglistParticipantInfo{roomParticipantInfo=");
        A1A.append(this.roomParticipantInfo);
        A1A.append(",isAttemptedJoiner=");
        A1A.append(this.isAttemptedJoiner);
        A1A.append(",timeSinceAttemptedJoin=");
        A1A.append(this.timeSinceAttemptedJoin);
        A1A.append(",inviteType=");
        return C21056XCh.A0A(A1A, this.inviteType);
    }
}
