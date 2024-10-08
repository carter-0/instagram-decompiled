package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LimitedInteractionsVersions implements Parcelable {
    UNRECOGNIZED("LimitedInteractionsVersions_unspecified"),
    V1("V1"),
    V2_CUSTOMIZABLE("V2_CUSTOMIZABLE"),
    V2_NOT_CUSTOMIZABLE("V2_NOT_CUSTOMIZABLE");
    
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
        LimitedInteractionsVersions[] limitedInteractionsVersionsArr;
        A02 = 0oU.A00(limitedInteractionsVersionsArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (LimitedInteractionsVersions limitedInteractionsVersions : values()) {
            linkedHashMap.put(limitedInteractionsVersions.A00, limitedInteractionsVersions);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(49);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LimitedInteractionsVersions(String str) {
        this.A00 = str;
    }
}
