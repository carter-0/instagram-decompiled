package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C11084S9e;
import X.C11085S9f;
import X.C41847B3o;
import X.Pxi;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class PuxPriceTableItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(5);
    public final Integer A00;
    public final Integer A01;
    public final ArrayList A02;
    public final RH6 A03;

    public PuxPriceTableItem(RH6 rh6, Integer num, Integer num2, ArrayList arrayList) {
        0qQ.A0B(rh6, 1);
        this.A03 = rh6;
        this.A01 = num;
        this.A00 = num2;
        this.A02 = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C11085S9f.A01(num));
        }
        Integer num2 = this.A00;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C11084S9e.A01(num2));
        }
        Iterator A0l = Pxi.A0l(parcel, this.A02);
        while (A0l.hasNext()) {
            C41847B3o.A1I(parcel, A0l, i);
        }
    }

    public final RH6 BJZ() {
        return this.A03;
    }
}
