package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41848B3p;
import X.C7X;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class PuxTermsConditionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(8);
    public final C7X A00;
    public final C7X A01;
    public final C7X A02;
    public final C7X A03;
    public final RH6 A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public PuxTermsConditionItem(C7X c7x, C7X c7x2, C7X c7x3, C7X c7x4, RH6 rh6, String str, String str2, List list, List list2, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A04 = rh6;
        this.A05 = str;
        this.A01 = c7x;
        this.A06 = str2;
        this.A07 = list;
        this.A02 = c7x2;
        this.A03 = c7x3;
        this.A08 = list2;
        this.A00 = c7x4;
        this.A09 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A03);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                parcel.writeValue(A1G.next());
            }
        }
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A04;
    }

    public PuxTermsConditionItem() {
        this((C7X) null, (C7X) null, (C7X) null, (C7X) null, RH6.A0m, (String) null, (String) null, (List) null, (List) null, false);
    }
}
