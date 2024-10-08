package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class CryptoParticipantIdentity {
    public static 2LV CONVERTER = C71546Omh.A00(30);
    public static long sMcfTypeId;
    public final boolean isNewIdentityKey;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native CryptoParticipantIdentity createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoParticipantIdentity)) {
            return false;
        }
        CryptoParticipantIdentity cryptoParticipantIdentity = (CryptoParticipantIdentity) obj;
        return this.participantId.equals(cryptoParticipantIdentity.participantId) && Arrays.equals(this.publicIdentityKey, cryptoParticipantIdentity.publicIdentityKey) && this.isNewIdentityKey == cryptoParticipantIdentity.isNewIdentityKey;
    }

    public int hashCode() {
        return ((C66583MXo.A06(this.participantId) + Arrays.hashCode(this.publicIdentityKey)) * 31) + (this.isNewIdentityKey ? 1 : 0);
    }

    public CryptoParticipantIdentity(String str, byte[] bArr, boolean z) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
        this.isNewIdentityKey = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CryptoParticipantIdentity{participantId=");
        A1A.append(this.participantId);
        A1A.append(",publicIdentityKey=");
        A1A.append(this.publicIdentityKey);
        A1A.append(",isNewIdentityKey=");
        return C66584MXp.A0b(A1A, this.isNewIdentityKey);
    }
}
