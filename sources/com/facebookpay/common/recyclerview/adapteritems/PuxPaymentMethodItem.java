package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.paymentmethod.model.PaymentMethod;

public final class PuxPaymentMethodItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(4);
    public final RH6 A00;
    public final PaymentMethod A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public PuxPaymentMethodItem(RH6 rh6, PaymentMethod paymentMethod, Integer num, boolean z, boolean z2) {
        0qQ.A0B(rh6, 1);
        this.A00 = rh6;
        this.A01 = paymentMethod;
        this.A03 = z;
        this.A02 = num;
        this.A04 = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A02));
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A00;
    }

    public PuxPaymentMethodItem() {
        this(RH6.A0h, (PaymentMethod) null, (Integer) null, false, true);
    }
}
