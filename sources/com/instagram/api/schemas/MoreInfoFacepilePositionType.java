package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MoreInfoFacepilePositionType implements Parcelable {
    UNRECOGNIZED("MoreInfoFacepilePositionType_unspecified"),
    BEFORE_TEXT("before_text"),
    BELOW_TEXT("below_text");
    
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
        MoreInfoFacepilePositionType[] moreInfoFacepilePositionTypeArr;
        A02 = 0oU.A00(moreInfoFacepilePositionTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MoreInfoFacepilePositionType moreInfoFacepilePositionType : values()) {
            linkedHashMap.put(moreInfoFacepilePositionType.A00, moreInfoFacepilePositionType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MoreInfoFacepilePositionType(String str) {
        this.A00 = str;
    }
}
