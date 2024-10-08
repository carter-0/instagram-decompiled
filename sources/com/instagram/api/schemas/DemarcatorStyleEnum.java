package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DemarcatorStyleEnum implements Parcelable {
    UNRECOGNIZED("DemarcatorStyleEnum_unspecified"),
    DISCOVER_MORE_V1("discover_more_v1"),
    HIDDEN("hidden"),
    RETURN_FEED_V1("return_feed_v1"),
    ON_TOP_V1("top_of_feed"),
    V2("v2"),
    V3("v3"),
    V4("v4");
    
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
        DemarcatorStyleEnum[] demarcatorStyleEnumArr;
        A02 = 0oU.A00(demarcatorStyleEnumArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (DemarcatorStyleEnum demarcatorStyleEnum : values()) {
            linkedHashMap.put(demarcatorStyleEnum.A00, demarcatorStyleEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(93);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DemarcatorStyleEnum(String str) {
        this.A00 = str;
    }
}
