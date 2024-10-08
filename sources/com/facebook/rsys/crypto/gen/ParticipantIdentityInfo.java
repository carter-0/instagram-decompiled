package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class ParticipantIdentityInfo {
    public static 2LV CONVERTER = C71546Omh.A00(32);
    public static long sMcfTypeId;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native ParticipantIdentityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantIdentityInfo)) {
            return false;
        }
        ParticipantIdentityInfo participantIdentityInfo = (ParticipantIdentityInfo) obj;
        return this.participantId.equals(participantIdentityInfo.participantId) && Arrays.equals(this.publicIdentityKey, participantIdentityInfo.publicIdentityKey);
    }

    public int hashCode() {
        return C66583MXo.A06(this.participantId) + Arrays.hashCode(this.publicIdentityKey);
    }

    public ParticipantIdentityInfo(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParticipantIdentityInfo{participantId=");
        A1A.append(this.participantId);
        A1A.append(",publicIdentityKey=");
        return C66582MXn.A0v(this.publicIdentityKey, A1A);
    }
}
