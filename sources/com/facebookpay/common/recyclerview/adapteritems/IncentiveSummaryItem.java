package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.0sn;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class IncentiveSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(93);
    public final int A00;
    public final List A01;
    public final RH6 A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A02);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
    }

    public final RH6 BJZ() {
        return this.A02;
    }

    public IncentiveSummaryItem(RH6 rh6, List list, int i) {
        AnonymousClass7TG.A1O(rh6, list);
        this.A02 = rh6;
        this.A01 = list;
        this.A00 = i;
    }

    public IncentiveSummaryItem() {
        this(RH6.A0J, 0sn.A00, 0);
    }
}
