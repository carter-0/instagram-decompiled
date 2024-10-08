package com.meta.payments.model.configuration;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum PartnerId implements Parcelable {
    SHOPIFY_LIVE,
    STRIPE_LIVE;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PartnerId[] partnerIdArr;
        A00 = 0oU.A00(partnerIdArr);
        CREATOR = new SWU(34);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
