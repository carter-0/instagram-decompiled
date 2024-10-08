package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CryptoE2eeModel {
    public static 2LV CONVERTER = C71546Omh.A00(29);
    public static long sMcfTypeId;
    public final int mode;
    public final ArrayList participantIdentities;

    public static native CryptoE2eeModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoE2eeModel)) {
            return false;
        }
        CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) obj;
        return this.mode == cryptoE2eeModel.mode && this.participantIdentities.equals(cryptoE2eeModel.participantIdentities);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.participantIdentities, C66583MXo.A01(this.mode));
    }

    public CryptoE2eeModel(int i, ArrayList arrayList) {
        arrayList.getClass();
        this.mode = i;
        this.participantIdentities = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CryptoE2eeModel{mode=");
        A1A.append(this.mode);
        A1A.append(",participantIdentities=");
        return C66582MXn.A0v(this.participantIdentities, A1A);
    }
}
