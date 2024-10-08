package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchPlayerCaptionsModel {
    public final ArrayList captions;

    public static native CowatchPlayerCaptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionsModel)) {
            return false;
        }
        return this.captions.equals(((CowatchPlayerCaptionsModel) obj).captions);
    }

    public final int hashCode() {
        return 527 + this.captions.hashCode();
    }

    public CowatchPlayerCaptionsModel(ArrayList arrayList) {
        arrayList.getClass();
        this.captions = arrayList;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchPlayerCaptionsModel{captions=");
        return C66582MXn.A0v(this.captions, A1A);
    }
}
