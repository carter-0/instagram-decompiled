package com.facebook.rsys.callcontext.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CallContext {
    public static 2LV CONVERTER = C22180Xwq.A00(17);
    public static long sMcfTypeId;
    public final McfReference appContext;
    public final int roomType;
    public final String selfActorId;
    public final String selfId;

    public static native CallContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallContext)) {
                return false;
            }
            CallContext callContext = (CallContext) obj;
            if (!this.selfId.equals(callContext.selfId)) {
                return false;
            }
            String str = this.selfActorId;
            String str2 = callContext.selfActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.roomType != callContext.roomType || !this.appContext.equals(callContext.appContext)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.appContext, (((C66583MXo.A06(this.selfId) + AnonymousClass7TG.A0E(this.selfActorId)) * 31) + this.roomType) * 31);
    }

    public CallContext(String str, String str2, int i, McfReference mcfReference) {
        str.getClass();
        mcfReference.getClass();
        this.selfId = str;
        this.selfActorId = str2;
        this.roomType = i;
        this.appContext = mcfReference;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallContext{selfId=");
        A1A.append(this.selfId);
        A1A.append(",selfActorId=");
        A1A.append(this.selfActorId);
        A1A.append(",roomType=");
        A1A.append(this.roomType);
        A1A.append(",appContext=");
        return C66582MXn.A0v(this.appContext, A1A);
    }
}
