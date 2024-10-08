package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RepostRestrictedReason implements Parcelable {
    UNRECOGNIZED("RepostRestrictedReason_unspecified"),
    CAROUSEL_SUB_ITEM("carousel_sub_item"),
    GENERIC("generic"),
    PRIVATE("private");
    
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
        RepostRestrictedReason[] repostRestrictedReasonArr;
        A02 = 0oU.A00(repostRestrictedReasonArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RepostRestrictedReason repostRestrictedReason : values()) {
            linkedHashMap.put(repostRestrictedReason.A00, repostRestrictedReason);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(17);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RepostRestrictedReason(String str) {
        this.A00 = str;
    }
}
