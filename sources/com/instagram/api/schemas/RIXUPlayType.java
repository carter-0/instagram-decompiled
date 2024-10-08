package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUPlayType implements Parcelable {
    UNRECOGNIZED("RIXUPlayType_unspecified"),
    CONCURRENT("concurrent"),
    FOCUSED("focused"),
    NO_ANIMATION("no_animation");
    
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
        RIXUPlayType[] rIXUPlayTypeArr;
        A02 = 0oU.A00(rIXUPlayTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXUPlayType rIXUPlayType : values()) {
            linkedHashMap.put(rIXUPlayType.A00, rIXUPlayType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(14);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUPlayType(String str) {
        this.A00 = str;
    }
}
