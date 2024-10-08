package com.meta.payments.model.payment;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum SummaryPaymentItemType implements Parcelable {
    SUBTOTAL,
    ESTIMATED_TAX,
    SHIPPING,
    OFFER;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        SummaryPaymentItemType[] summaryPaymentItemTypeArr;
        A00 = 0oU.A00(summaryPaymentItemTypeArr);
        CREATOR = new SWU(49);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
