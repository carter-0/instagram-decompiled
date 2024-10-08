package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUCoverSize implements Parcelable {
    UNRECOGNIZED("RIXUCoverSize_unspecified"),
    EXTRA_SMALL("extra_small"),
    SMALL("small"),
    MEDIUM("medium");
    
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
        RIXUCoverSize[] rIXUCoverSizeArr;
        A02 = 0oU.A00(rIXUCoverSizeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXUCoverSize rIXUCoverSize : values()) {
            linkedHashMap.put(rIXUCoverSize.A00, rIXUCoverSize);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(60);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUCoverSize(String str) {
        this.A00 = str;
    }
}
