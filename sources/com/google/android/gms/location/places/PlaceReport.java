package com.google.android.gms.location.places;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.S4O;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(47);
    public final String A00;
    public final String A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        if (!SA1.A01(this.A01, placeReport.A01) || !SA1.A01(this.A00, placeReport.A00)) {
            return false;
        }
        return SA1.A00(this.A03, placeReport.A03);
    }

    public final int hashCode() {
        return Pxf.A0B(this.A01, this.A00, this.A03);
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(this.A01, "placeId");
        s4o.A00(this.A00, "tag");
        String str = this.A03;
        if (!"unknown".equals(str)) {
            s4o.A00(str, "source");
        }
        return s4o.toString();
    }

    public PlaceReport(int i, String str, String str2, String str3) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A02);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0C(parcel, this.A00, 3, false);
        Pxi.A14(parcel, this.A03, A032, false);
    }
}
