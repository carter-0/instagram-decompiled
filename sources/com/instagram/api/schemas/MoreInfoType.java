package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MoreInfoType implements Parcelable {
    UNRECOGNIZED("MoreInfoType_unspecified"),
    ADS_VIEW("ads_view"),
    ADS_VISIT("ads_visit"),
    BUSINESS_CATEGORY("business_category"),
    FOLLOWED_BY("followed_by"),
    FOLLOWER_COUNT("follower_count"),
    HEADLINE("headline"),
    LIKED_BY("liked_by"),
    PRODUCT_TAG("product_tag"),
    PROFILE_PAGE_VISIT_COUNT("profile_page_visit_count"),
    PROMOTION("promotion"),
    RATINGS_AND_REVIEWS("ratings_and_reviews");
    
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
        MoreInfoType[] moreInfoTypeArr;
        A02 = 0oU.A00(moreInfoTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MoreInfoType moreInfoType : values()) {
            linkedHashMap.put(moreInfoType.A00, moreInfoType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(72);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MoreInfoType(String str) {
        this.A00 = str;
    }
}
