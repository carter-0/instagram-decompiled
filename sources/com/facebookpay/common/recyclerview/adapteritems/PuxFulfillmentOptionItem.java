package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C11084S9e;
import X.C11085S9f;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;

public final class PuxFulfillmentOptionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(2);
    public final RH6 A00;
    public final FulfillmentOptionComponent A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;

    public PuxFulfillmentOptionItem(RH6 rh6, FulfillmentOptionComponent fulfillmentOptionComponent, Integer num, Integer num2, boolean z, boolean z2) {
        0qQ.A0B(rh6, 1);
        this.A00 = rh6;
        this.A01 = fulfillmentOptionComponent;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = num;
        this.A02 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C11085S9f.A01(num));
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(C11084S9e.A01(num2));
    }

    public final RH6 BJZ() {
        return this.A00;
    }

    public PuxFulfillmentOptionItem() {
        this(RH6.A0e, (FulfillmentOptionComponent) null, AnonymousClass05K.A00, (Integer) null, false, false);
    }
}
