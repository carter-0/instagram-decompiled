package com.instagram.model.shopping.featuredproduct;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FeaturedProductPermissionStatus implements Parcelable {
    UNRECOGNIZED("FeaturedProductPermissionStatus_unspecified"),
    APPROVED("APPROVED"),
    CANCELED("CANCELED"),
    CANCELED_BY_EDIT("CANCELED_BY_EDIT"),
    CANCELED_BY_EXPIRATION("CANCELED_BY_EXPIRATION"),
    CANCELED_BY_MANUAL_QUALITY_AUDIT("CANCELED_BY_MANUAL_QUALITY_AUDIT"),
    DECLINED("DECLINED"),
    DECLINED_BY_AGE("DECLINED_BY_AGE"),
    DECLINED_BY_ASSOCIATED_USER("DECLINED_BY_ASSOCIATED_USER"),
    MEDIA_BI_REVIEW_PENDING("MEDIA_BI_REVIEW_PENDING"),
    MEDIA_BI_REVIEW_REJECTED("MEDIA_BI_REVIEW_REJECTED"),
    PENDING("PENDING");
    
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
        FeaturedProductPermissionStatus[] featuredProductPermissionStatusArr;
        A02 = 0oU.A00(featuredProductPermissionStatusArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (FeaturedProductPermissionStatus featuredProductPermissionStatus : values()) {
            linkedHashMap.put(featuredProductPermissionStatus.A00, featuredProductPermissionStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(49);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FeaturedProductPermissionStatus(String str) {
        this.A00 = str;
    }
}
