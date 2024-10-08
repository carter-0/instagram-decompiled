package com.facebookpay.paymentmethod.model;

import X.0qQ;
import X.C21267XRm;
import X.QVD;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class PayPalCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = SWW.A00(12);
    public final QVD A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public final String Asm() {
        String A07;
        QVD qvd = this.A00;
        if (qvd != null && (A07 = qvd.A07("credential_id")) != null) {
            return A07;
        }
        String str = this.A01;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final C21267XRm Asn() {
        return C21267XRm.A08;
    }

    public final String BEP() {
        String A0A;
        QVD qvd = this.A00;
        if (qvd == null || (A0A = qvd.A0A("icon_url")) == null) {
            return "";
        }
        return A0A;
    }

    public final String getSubtitle() {
        String A09;
        QVD qvd = this.A00;
        if (qvd == null || (A09 = qvd.A09("pp_subtitle")) == null) {
            return "";
        }
        return A09;
    }

    public final String getTitle() {
        String A08;
        QVD qvd = this.A00;
        if (qvd == null || (A08 = qvd.A08("pp_title")) == null) {
            return "";
        }
        return A08;
    }

    public PayPalCredential(QVD qvd, String str, boolean z) {
        this.A00 = qvd;
        this.A02 = z;
        this.A01 = str;
    }

    public PayPalCredential() {
        this((QVD) null, (String) null, false);
    }
}
