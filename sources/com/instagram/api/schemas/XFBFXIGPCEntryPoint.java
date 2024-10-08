package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XFBFXIGPCEntryPoint implements Parcelable {
    UNRECOGNIZED("XFBFXIGPCEntryPoint_unspecified"),
    BLOCKING_INTERSTITIAL("BLOCKING_INTERSTITIAL"),
    FORCED_DEPRECATION("FORCED_DEPRECATION"),
    LOGIN_INFO("LOGIN_INFO"),
    LOGIN_MAINFEED_QP("LOGIN_MAINFEED_QP"),
    LOGIN_NOTIFICATION("LOGIN_NOTIFICATION"),
    SWITCHER_MAINFEED_QP("SWITCHER_MAINFEED_QP"),
    SWITCHER_NOTIFICATION("SWITCHER_NOTIFICATION");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XFBFXIGPCEntryPoint[] xFBFXIGPCEntryPointArr;
        A02 = 0oU.A00(xFBFXIGPCEntryPointArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint : values()) {
            A0x.put(xFBFXIGPCEntryPoint.A00, xFBFXIGPCEntryPoint);
        }
        A01 = A0x;
        CREATOR = FK6.A00(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBFXIGPCEntryPoint(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
