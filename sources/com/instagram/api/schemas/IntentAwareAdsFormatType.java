package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IntentAwareAdsFormatType implements Parcelable {
    UNRECOGNIZED("IntentAwareAdsFormatType_unspecified"),
    B2B_AD_POD("B2B_AD_POD"),
    GRID("GRID"),
    H_SCROLL("H_SCROLL"),
    MAC_BANNER_V1("MAC_BANNER_V1"),
    MAC_SUBTLE_V1("MAC_SUBTLE_V1"),
    MAC_SUBTLE_V2("MAC_SUBTLE_V2"),
    MEGACARD("MEGACARD"),
    SINGLE_AD("SINGLE_AD");
    
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
        IntentAwareAdsFormatType[] intentAwareAdsFormatTypeArr;
        A02 = 0oU.A00(intentAwareAdsFormatTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IntentAwareAdsFormatType intentAwareAdsFormatType : values()) {
            linkedHashMap.put(intentAwareAdsFormatType.A00, intentAwareAdsFormatType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(46);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IntentAwareAdsFormatType(String str) {
        this.A00 = str;
    }
}
