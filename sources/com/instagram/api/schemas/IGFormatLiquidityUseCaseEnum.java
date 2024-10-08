package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGFormatLiquidityUseCaseEnum implements Parcelable {
    UNRECOGNIZED("IGFormatLiquidityUseCaseEnum_unspecified"),
    DYNAMIC_CAROUSEL_TO_COLLECTION("DYNAMIC_CAROUSEL_TO_COLLECTION"),
    PARTNERSHIP_DYNAMIC_COLLECTION("PARTNERSHIP_DYNAMIC_COLLECTION"),
    PRODUCT_EXTENSION_SINGLE_MEDIA_9X16_LEARNING("PRODUCT_EXTENSION_SINGLE_MEDIA_9X16_LEARNING"),
    PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION("PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION"),
    PRODUCT_TAGS_SINGLE_MEDIA_TO_COLLECTION("PRODUCT_TAGS_SINGLE_MEDIA_TO_COLLECTION"),
    PROFILE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION("PROFILE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION"),
    SITE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION("SITE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION");
    
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
        IGFormatLiquidityUseCaseEnum[] iGFormatLiquidityUseCaseEnumArr;
        A02 = 0oU.A00(iGFormatLiquidityUseCaseEnumArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum : values()) {
            linkedHashMap.put(iGFormatLiquidityUseCaseEnum.A00, iGFormatLiquidityUseCaseEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(30);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGFormatLiquidityUseCaseEnum(String str) {
        this.A00 = str;
    }
}
