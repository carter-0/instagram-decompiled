package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class PaymentMethodImpl extends AnonymousClass0T0 implements Parcelable, PaymentMethod {
    public static final Parcelable.Creator CREATOR = DE6.A00(11);
    public final CreditCardAssociation A00;
    public final FundingSourceType A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentMethodImpl) {
                PaymentMethodImpl paymentMethodImpl = (PaymentMethodImpl) obj;
                if (this.A00 != paymentMethodImpl.A00 || this.A01 != paymentMethodImpl.A01 || !0qQ.A0K(this.A02, paymentMethodImpl.A02) || !0qQ.A0K(this.A03, paymentMethodImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final FundingSourceType Bb4() {
        return this.A01;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A07(this.A01, A0K) + AnonymousClass7TG.A0E(this.A02)) * 31);
    }

    public PaymentMethodImpl(CreditCardAssociation creditCardAssociation, FundingSourceType fundingSourceType, String str, String str2) {
        AnonymousClass7TG.A1O(creditCardAssociation, fundingSourceType);
        0qQ.A0B(str2, 4);
        this.A00 = creditCardAssociation;
        this.A01 = fundingSourceType;
        this.A02 = str;
        this.A03 = str2;
    }
}
