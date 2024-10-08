package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsRatingAndReviewDisplayFormat implements Parcelable {
    UNRECOGNIZED("AdsRatingAndReviewDisplayFormat_unspecified"),
    ADVERTISER_FB_POA_RATING("ADVERTISER_FB_POA_RATING"),
    DIMENSIONAL_KEYWORD("DIMENSIONAL_KEYWORD"),
    STAR_RATING("STAR_RATING"),
    TEXT_ONLY("TEXT_ONLY"),
    TEXT_WITH_A_STAR("TEXT_WITH_A_STAR"),
    TEXT_WITH_SATISFACTION_SCORE("TEXT_WITH_SATISFACTION_SCORE"),
    TOPIC_EXTRACTION_KEYWORD("TOPIC_EXTRACTION_KEYWORD");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdsRatingAndReviewDisplayFormat[] adsRatingAndReviewDisplayFormatArr;
        A02 = 0oU.A00(adsRatingAndReviewDisplayFormatArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat : values()) {
            A0x.put(adsRatingAndReviewDisplayFormat.A00, adsRatingAndReviewDisplayFormat);
        }
        A01 = A0x;
        CREATOR = SWT.A00(33);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsRatingAndReviewDisplayFormat(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
