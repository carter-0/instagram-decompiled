package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum AdsManagerPaymentAnomalyType implements Parcelable {
    ACCOUNT_SPEND_LIMIT_REACHED("account_spend_limit_reached"),
    UNSETTLED("unsettled");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        AdsManagerPaymentAnomalyType[] adsManagerPaymentAnomalyTypeArr;
        A01 = 0oU.A00(adsManagerPaymentAnomalyTypeArr);
        CREATOR = new W6D(14);
    }

    /* access modifiers changed from: public */
    AdsManagerPaymentAnomalyType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
