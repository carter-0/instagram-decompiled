package com.instagram.api.schemas;

import X.0oU;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BoostedActionStatus implements Parcelable {
    UNRECOGNIZED("BoostedActionStatus_unspecified"),
    ACTIVE("ACTIVE"),
    AUTHENTICATION_NEEDED("AUTHENTICATION_NEEDED"),
    CANCELED("CANCELED"),
    CONFIRMATION_REQUIRED("CONFIRMATION_REQUIRED"),
    CREATING("CREATING"),
    DRAFT("DRAFT"),
    ERROR("ERROR"),
    EXTENDABLE("EXTENDABLE"),
    FINISHED("FINISHED"),
    INACTIVE("INACTIVE"),
    LIMITED_DELIVERY("LIMITED_DELIVERY"),
    NOT_DELIVERING("NOT_DELIVERING"),
    NO_CTA("NO_CTA"),
    PAUSED("PAUSED"),
    PENDING("PENDING"),
    PENDING_FUNDING_SOURCE("PENDING_FUNDING_SOURCE"),
    REJECTED("REJECTED"),
    REVIEW_NEEDED("REVIEW_NEEDED"),
    SCHEDULED("SCHEDULED");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BoostedActionStatus[] boostedActionStatusArr;
        A02 = 0oU.A00(boostedActionStatusArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (BoostedActionStatus boostedActionStatus : values()) {
            linkedHashMap.put(boostedActionStatus.A00, boostedActionStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(65);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BoostedActionStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
