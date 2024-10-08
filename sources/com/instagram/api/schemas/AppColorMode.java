package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AppColorMode implements Parcelable {
    UNRECOGNIZED("AppColorMode_unspecified"),
    DARK("DARK"),
    A05(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AppColorMode[] appColorModeArr;
        A02 = 0oU.A00(appColorModeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AppColorMode appColorMode : values()) {
            linkedHashMap.put(appColorMode.A00, appColorMode);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(50);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AppColorMode(String str) {
        this.A00 = str;
    }
}
