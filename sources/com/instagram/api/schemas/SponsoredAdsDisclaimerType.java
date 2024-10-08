package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SponsoredAdsDisclaimerType implements Parcelable {
    UNRECOGNIZED("SponsoredAdsDisclaimerType_unspecified"),
    BASIC_ADS("basic_ads");
    
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
        SponsoredAdsDisclaimerType[] sponsoredAdsDisclaimerTypeArr;
        A02 = 0oU.A00(sponsoredAdsDisclaimerTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType : values()) {
            linkedHashMap.put(sponsoredAdsDisclaimerType.A00, sponsoredAdsDisclaimerType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(27);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SponsoredAdsDisclaimerType(String str) {
        this.A00 = str;
    }
}
