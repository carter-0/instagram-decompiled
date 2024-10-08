package com.meta.payments.model.payment;

import X.0qQ;
import X.C51974G9v;
import X.SWU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.payments.model.configuration.InternalPaymentConfiguration;

public final class InternalPaymentRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(43);
    public final Bundle A00;
    public final InternalPaymentConfiguration A01;
    public final InternalPaymentDetails A02;
    public final InternalPaymentOptions A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        this.A02.writeToParcel(parcel, i);
        InternalPaymentOptions internalPaymentOptions = this.A03;
        if (internalPaymentOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            internalPaymentOptions.writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.A00);
    }

    public InternalPaymentRequest(Bundle bundle, InternalPaymentConfiguration internalPaymentConfiguration, InternalPaymentDetails internalPaymentDetails, InternalPaymentOptions internalPaymentOptions) {
        C51974G9v.A1L(internalPaymentConfiguration, internalPaymentDetails, bundle);
        this.A01 = internalPaymentConfiguration;
        this.A02 = internalPaymentDetails;
        this.A03 = internalPaymentOptions;
        this.A00 = bundle;
    }
}
