package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class PaymentInfo extends AnonymousClass0T0 implements Parcelable, PaymentInfoIntf {
    public static final Parcelable.Creator CREATOR = new DE6(10);
    public final PaymentMethod A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentInfo) {
                PaymentInfo paymentInfo = (PaymentInfo) obj;
                if (!0qQ.A0K(this.A01, paymentInfo.A01) || !0qQ.A0K(this.A02, paymentInfo.A02) || !0qQ.A0K(this.A03, paymentInfo.A03) || this.A04 != paymentInfo.A04 || !0qQ.A0K(this.A00, paymentInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, ((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public PaymentInfo(PaymentMethod paymentMethod, Integer num, Integer num2, String str, boolean z) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A04 = z;
        this.A00 = paymentMethod;
    }
}
