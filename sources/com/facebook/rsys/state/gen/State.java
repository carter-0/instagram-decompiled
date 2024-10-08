package com.facebook.rsys.state.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class State {
    public static 2LV CONVERTER = new C71545Omg(5);
    public static long sMcfTypeId;
    public final int callState;
    public final boolean isActive;
    public final String localCallId;
    public final String selfUserId;

    public static native State createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            if (!this.selfUserId.equals(state.selfUserId)) {
                return false;
            }
            String str = this.localCallId;
            String str2 = state.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.callState == state.callState && this.isActive == state.isActive)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C66583MXo.A06(this.selfUserId) + AnonymousClass7TG.A0E(this.localCallId)) * 31) + this.callState) * 31) + (this.isActive ? 1 : 0);
    }

    public State(String str, String str2, int i, boolean z) {
        str.getClass();
        this.selfUserId = str;
        this.localCallId = str2;
        this.callState = i;
        this.isActive = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("State{selfUserId=");
        A1A.append(this.selfUserId);
        A1A.append(",localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",callState=");
        A1A.append(this.callState);
        A1A.append(",isActive=");
        return C66584MXp.A0b(A1A, this.isActive);
    }
}
