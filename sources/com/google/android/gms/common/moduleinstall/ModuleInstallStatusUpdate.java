package com.google.android.gms.common.moduleinstall;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(40);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Long A03;
    public final Long A04;

    public ModuleInstallStatusUpdate(Long l, Long l2, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = l;
        this.A04 = l2;
        this.A02 = i3;
        if (l != null && l2 != null) {
            l2.longValue();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        Long l = this.A03;
        if (l != null) {
            parcel.writeInt(524291);
            Pxf.A18(parcel, l);
        }
        Long l2 = this.A04;
        if (l2 != null) {
            parcel.writeInt(524292);
            Pxf.A18(parcel, l2);
        }
        C301145yd.A07(parcel, 5, this.A02);
        C301145yd.A06(parcel, A032);
    }
}
