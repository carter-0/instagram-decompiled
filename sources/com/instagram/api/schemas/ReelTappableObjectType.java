package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ReelTappableObjectType implements Parcelable {
    ;
    
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
        ReelTappableObjectType[] reelTappableObjectTypeArr;
        A02 = 0oU.A00(reelTappableObjectTypeArr);
        int A0L2 = 0se.A0L(r4);
        if (A0L2 < 16) {
            A0L2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2);
        for (ReelTappableObjectType reelTappableObjectType : values()) {
            linkedHashMap.put(reelTappableObjectType.A00, reelTappableObjectType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(65);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ReelTappableObjectType(String str) {
        this.A00 = str;
    }
}
