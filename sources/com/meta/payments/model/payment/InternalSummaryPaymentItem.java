package com.meta.payments.model.payment;

import X.0qQ;
import X.C51974G9v;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class InternalSummaryPaymentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(45);
    public final int A00;
    public final Bundle A01;
    public final PaymentCurrencyAmount A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
    }

    public InternalSummaryPaymentItem(Bundle bundle, PaymentCurrencyAmount paymentCurrencyAmount, String str, int i) {
        C51974G9v.A1L(paymentCurrencyAmount, str, bundle);
        this.A02 = paymentCurrencyAmount;
        this.A03 = str;
        this.A00 = i;
        this.A01 = bundle;
    }
}
