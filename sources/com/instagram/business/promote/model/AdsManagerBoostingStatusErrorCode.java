package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum AdsManagerBoostingStatusErrorCode implements Parcelable {
    DEFAULT_DO_NOT_USE("default_do_not_use"),
    SHOPPING_POST_TAGGED_PRODUCT_REJECTED("shopping_post_tagged_product_rejected");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        AdsManagerBoostingStatusErrorCode[] adsManagerBoostingStatusErrorCodeArr;
        A01 = 0oU.A00(adsManagerBoostingStatusErrorCodeArr);
        CREATOR = new W6D(13);
    }

    /* access modifiers changed from: public */
    AdsManagerBoostingStatusErrorCode(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
