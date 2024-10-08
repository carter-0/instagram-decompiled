package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class PaymentConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(9);
    public final String A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentConfig) {
                PaymentConfig paymentConfig = (PaymentConfig) obj;
                if (!0qQ.A0K(this.A01, paymentConfig.A01) || !0qQ.A0K(this.A00, paymentConfig.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public PaymentConfig(List list, String str) {
        AnonymousClass7TG.A1O(list, str);
        this.A01 = list;
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PaymentConfig(supportedContainerTypes=");
        A1A.append(this.A01);
        A1A.append(", paymentMode=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
