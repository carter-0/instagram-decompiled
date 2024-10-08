package com.meta.payments.model.payment;

import X.0qQ;
import X.C41848B3p;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.payments.model.offer.InternalOffer;
import com.meta.payments.model.shipping.InternalShippingOption;
import java.util.Iterator;
import java.util.List;

public final class InternalPaymentDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(40);
    public final Bundle A00;
    public final InternalPaymentItem A01;
    public final PaymentAddress A02;
    public final PaymentAddress A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        InternalPaymentItem internalPaymentItem = this.A01;
        if (internalPaymentItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            internalPaymentItem.writeToParcel(parcel, i);
        }
        Iterator A1F = C41848B3p.A1F(parcel, this.A08);
        while (A1F.hasNext()) {
            ((InternalSummaryPaymentItem) A1F.next()).writeToParcel(parcel, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A05);
        while (A1F2.hasNext()) {
            ((InternalPaymentItem) A1F2.next()).writeToParcel(parcel, i);
        }
        Iterator A1F3 = C41848B3p.A1F(parcel, this.A06);
        while (A1F3.hasNext()) {
            ((InternalOffer) A1F3.next()).writeToParcel(parcel, i);
        }
        PaymentAddress paymentAddress = this.A02;
        if (paymentAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentAddress.writeToParcel(parcel, i);
        }
        PaymentAddress paymentAddress2 = this.A03;
        if (paymentAddress2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentAddress2.writeToParcel(parcel, i);
        }
        Iterator A1F4 = C41848B3p.A1F(parcel, this.A07);
        while (A1F4.hasNext()) {
            ((InternalShippingOption) A1F4.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeBundle(this.A00);
    }

    public InternalPaymentDetails(Bundle bundle, InternalPaymentItem internalPaymentItem, PaymentAddress paymentAddress, PaymentAddress paymentAddress2, String str, List list, List list2, List list3, List list4) {
        0qQ.A0B(bundle, 9);
        this.A01 = internalPaymentItem;
        this.A08 = list;
        this.A05 = list2;
        this.A06 = list3;
        this.A02 = paymentAddress;
        this.A03 = paymentAddress2;
        this.A07 = list4;
        this.A04 = str;
        this.A00 = bundle;
    }
}
