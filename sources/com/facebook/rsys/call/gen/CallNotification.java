package com.facebook.rsys.call.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CallNotification {
    public static 2LV CONVERTER = C22180Xwq.A00(16);
    public static long sMcfTypeId;
    public final int notificationType;
    public final String userId;

    public static native CallNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallNotification)) {
            return false;
        }
        CallNotification callNotification = (CallNotification) obj;
        return this.userId.equals(callNotification.userId) && this.notificationType == callNotification.notificationType;
    }

    public int hashCode() {
        return C66583MXo.A06(this.userId) + this.notificationType;
    }

    public String toString() {
        return 002.A09(this.notificationType, "CallNotification{userId=", this.userId, ",notificationType=", "}");
    }

    public CallNotification(String str, int i) {
        str.getClass();
        this.userId = str;
        this.notificationType = i;
    }
}
