package com.facebookpay.paymentmethod.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21267XRm;
import X.QR8;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class APMCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = SWW.A00(10);
    public final C21267XRm A00;
    public final QR8 A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
    }

    public final String Asm() {
        String A08 = this.A01.A08("credential_id");
        if (A08 == null) {
            return "";
        }
        return A08;
    }

    public final C21267XRm Asn() {
        return this.A00;
    }

    public final String BEP() {
        String A09 = this.A01.A09("icon_url");
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    public final String getSubtitle() {
        String A0A = this.A01.A0A("email_address");
        if (A0A == null) {
            return "";
        }
        return A0A;
    }

    public final String getTitle() {
        String A07 = this.A01.A07("credential_display_name");
        if (A07 == null) {
            return "";
        }
        return A07;
    }

    public APMCredential(QR8 qr8, C21267XRm xRm, boolean z) {
        AnonymousClass7TG.A1P(qr8, xRm);
        this.A01 = qr8;
        this.A02 = z;
        this.A00 = xRm;
    }
}
