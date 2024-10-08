package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13925TlT;
import X.C41848B3p;
import X.C51974G9v;
import X.DbT;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SelectionIncentiveEmbeddedBloksItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(13);
    public final C13925TlT A00;
    public final List A01;
    public final List A02;
    public final 0sP A03;
    public final 0sP A04;
    public final boolean A05;
    public final RH6 A06;

    public SelectionIncentiveEmbeddedBloksItem(C13925TlT tlT, RH6 rh6, List list, List list2, 0sP r6, 0sP r7, boolean z) {
        C51974G9v.A0d(1, rh6, list2, r6, r7);
        this.A06 = rh6;
        this.A00 = tlT;
        this.A02 = list;
        this.A01 = list2;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A06);
        parcel.writeValue(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            Map map = (Map) A1F.next();
            parcel.writeInt(map.size());
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                parcel.writeString(DbT.A13(A1J));
                parcel.writeValue(A1J.getValue());
            }
        }
        parcel.writeStringList(this.A01);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A06;
    }
}
