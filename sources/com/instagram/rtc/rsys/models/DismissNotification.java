package com.instagram.rtc.rsys.models;

import X.002;
import X.2LV;
import X.C22179Xwp;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class DismissNotification {
    public static 2LV CONVERTER = new C22179Xwp(24);
    public static long sMcfTypeId;
    public final int reason;
    public final String serverInfoData;

    public static native DismissNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissNotification)) {
            return false;
        }
        DismissNotification dismissNotification = (DismissNotification) obj;
        return this.serverInfoData.equals(dismissNotification.serverInfoData) && this.reason == dismissNotification.reason;
    }

    public int hashCode() {
        return C66583MXo.A06(this.serverInfoData) + this.reason;
    }

    public String toString() {
        return 002.A09(this.reason, "DismissNotification{serverInfoData=", this.serverInfoData, ",reason=", "}");
    }

    public DismissNotification(String str, int i) {
        str.getClass();
        this.serverInfoData = str;
        this.reason = i;
    }
}
