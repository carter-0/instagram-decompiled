package com.meta.payments.model.payment;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class InternalPaymentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(41);
    public final Bundle A00;
    public final PaymentCurrencyAmount A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public InternalPaymentItem(Bundle bundle, PaymentCurrencyAmount paymentCurrencyAmount, Integer num, String str, String str2, String str3, String str4) {
        0qQ.A0B(bundle, 7);
        this.A01 = paymentCurrencyAmount;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = num;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        PaymentCurrencyAmount paymentCurrencyAmount = this.A01;
        if (paymentCurrencyAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentCurrencyAmount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A00);
    }
}
