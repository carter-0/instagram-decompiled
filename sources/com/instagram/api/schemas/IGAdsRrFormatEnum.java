package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdsRrFormatEnum implements Parcelable {
    UNRECOGNIZED("IGAdsRrFormatEnum_unspecified"),
    PROFILE_CARD_DIMENSIONAL("PROFILE_CARD_DIMENSIONAL"),
    PROFILE_CARD_RATING_ONLY("PROFILE_CARD_RATING_ONLY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGAdsRrFormatEnum[] iGAdsRrFormatEnumArr;
        A02 = 0oU.A00(iGAdsRrFormatEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (IGAdsRrFormatEnum iGAdsRrFormatEnum : values()) {
            linkedHashMap.put(iGAdsRrFormatEnum.A00, iGAdsRrFormatEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsRrFormatEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
