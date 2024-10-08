package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXULayoutFormat implements Parcelable {
    UNRECOGNIZED("RIXULayoutFormat_unspecified"),
    GRID("grid"),
    GRID_2X2("grid_2x2"),
    GRID_3X2("grid_3x2");
    
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
        RIXULayoutFormat[] rIXULayoutFormatArr;
        A02 = 0oU.A00(rIXULayoutFormatArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXULayoutFormat rIXULayoutFormat : values()) {
            linkedHashMap.put(rIXULayoutFormat.A00, rIXULayoutFormat);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(12);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXULayoutFormat(String str) {
        this.A00 = str;
    }
}
