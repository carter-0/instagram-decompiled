package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsRatingAndReviewStarType implements Parcelable {
    UNRECOGNIZED("AdsRatingAndReviewStarType_unspecified"),
    EMPTY("EMPTY"),
    FULL("FULL"),
    HALF("HALF");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdsRatingAndReviewStarType[] adsRatingAndReviewStarTypeArr;
        A02 = 0oU.A00(adsRatingAndReviewStarTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : values()) {
            linkedHashMap.put(adsRatingAndReviewStarType.A00, adsRatingAndReviewStarType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(34);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsRatingAndReviewStarType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
