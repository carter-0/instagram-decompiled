package com.meta.payments.model.payment;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class InternalPaymentContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(39);
    public final int A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public InternalPaymentContainer(int i, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
