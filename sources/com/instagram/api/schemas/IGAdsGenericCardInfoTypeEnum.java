package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdsGenericCardInfoTypeEnum implements Parcelable {
    UNRECOGNIZED("IGAdsGenericCardInfoTypeEnum_unspecified"),
    BASIC_CARD("BASIC_CARD"),
    HEADLINE("HEADLINE"),
    JOIN_TIME("JOIN_TIME"),
    NUMBER_OF_FOLLOWERS("NUMBER_OF_FOLLOWERS"),
    PAYMENT_OPTIONS("PAYMENT_OPTIONS"),
    PRICE_RANGE("PRICE_RANGE"),
    RATING_AND_REVIEW("RATING_AND_REVIEW"),
    RETURN_POLICY("RETURN_POLICY"),
    SHIPPING_POLICY("SHIPPING_POLICY");
    
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
        IGAdsGenericCardInfoTypeEnum[] iGAdsGenericCardInfoTypeEnumArr;
        A02 = 0oU.A00(iGAdsGenericCardInfoTypeEnumArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum : values()) {
            linkedHashMap.put(iGAdsGenericCardInfoTypeEnum.A00, iGAdsGenericCardInfoTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(23);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsGenericCardInfoTypeEnum(String str) {
        this.A00 = str;
    }
}
