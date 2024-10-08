package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUCoverChainingType implements Parcelable {
    UNRECOGNIZED("RIXUCoverChainingType_unspecified"),
    CONTEXTUAL_CHAINING("contextual_chaining"),
    UNIFIED_CHAINING("unified_chaining");
    
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
        RIXUCoverChainingType[] rIXUCoverChainingTypeArr;
        A02 = 0oU.A00(rIXUCoverChainingTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXUCoverChainingType rIXUCoverChainingType : values()) {
            linkedHashMap.put(rIXUCoverChainingType.A00, rIXUCoverChainingType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(10);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUCoverChainingType(String str) {
        this.A00 = str;
    }
}
