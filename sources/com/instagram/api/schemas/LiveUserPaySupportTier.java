package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LiveUserPaySupportTier implements Parcelable {
    UNRECOGNIZED("LiveUserPaySupportTier_unspecified"),
    TIER1("tier_1"),
    TIER2("tier_2");
    
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
        LiveUserPaySupportTier[] liveUserPaySupportTierArr;
        A02 = 0oU.A00(liveUserPaySupportTierArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (LiveUserPaySupportTier liveUserPaySupportTier : values()) {
            linkedHashMap.put(liveUserPaySupportTier.A00, liveUserPaySupportTier);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(51);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LiveUserPaySupportTier(String str) {
        this.A00 = str;
    }
}
