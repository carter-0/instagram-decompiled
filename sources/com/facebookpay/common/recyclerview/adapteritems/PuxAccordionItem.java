package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10781Ry2;
import X.C41848B3p;
import X.RH6;
import X.SUj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class PuxAccordionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(98);
    public final C10781Ry2 A00;
    public final SUj A01;
    public final List A02;
    public final boolean A03;
    public final RH6 A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A04);
        parcel.writeValue(this.A01);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            parcel.writeValue(A1F.next());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeValue(this.A00);
    }

    public final RH6 BJZ() {
        return this.A04;
    }

    public PuxAccordionItem(RH6 rh6, C10781Ry2 ry2, SUj sUj, List list, boolean z) {
        AnonymousClass7TG.A1U(rh6, sUj, list);
        this.A04 = rh6;
        this.A01 = sUj;
        this.A02 = list;
        this.A03 = z;
        this.A00 = ry2;
    }
}
