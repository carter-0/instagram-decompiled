package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class CallEndedModel {
    public static 2LV CONVERTER = new C71545Omg(19);
    public static long sMcfTypeId;
    public final boolean endedRemotely;
    public final int reason;
    public final boolean wasConnected;

    public static native CallEndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallEndedModel)) {
            return false;
        }
        CallEndedModel callEndedModel = (CallEndedModel) obj;
        return this.reason == callEndedModel.reason && this.endedRemotely == callEndedModel.endedRemotely && this.wasConnected == callEndedModel.wasConnected;
    }

    public int hashCode() {
        return ((C66583MXo.A01(this.reason) + (this.endedRemotely ? 1 : 0)) * 31) + (this.wasConnected ? 1 : 0);
    }

    public CallEndedModel(int i, boolean z, boolean z2) {
        this.reason = i;
        this.endedRemotely = z;
        this.wasConnected = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallEndedModel{reason=");
        A1A.append(this.reason);
        A1A.append(",endedRemotely=");
        A1A.append(this.endedRemotely);
        A1A.append(",wasConnected=");
        return C66584MXp.A0b(A1A, this.wasConnected);
    }
}
