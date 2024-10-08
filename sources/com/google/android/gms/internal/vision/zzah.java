package com.google.android.gms.internal.vision;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(39);
    public final int A00;
    public final int A01;
    public final zzab A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzao[] A06;
    public final float A07;
    public final int A08;
    public final zzab A09;
    public final zzab A0A;

    public zzah(zzab zzab, zzab zzab2, zzab zzab3, String str, String str2, zzao[] zzaoArr, float f, int i, int i2, int i3, boolean z) {
        this.A06 = zzaoArr;
        this.A02 = zzab;
        this.A09 = zzab2;
        this.A0A = zzab3;
        this.A03 = str;
        this.A07 = f;
        this.A04 = str2;
        this.A08 = i;
        this.A05 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0G(parcel, this.A06, 2, i);
        C301145yd.A0A(parcel, this.A02, 3, i, false);
        C301145yd.A0A(parcel, this.A09, 4, i, false);
        C301145yd.A0A(parcel, this.A0A, 5, i, false);
        C301145yd.A0C(parcel, this.A03, 6, false);
        C301145yd.A04(parcel, this.A07, 7);
        C301145yd.A0C(parcel, this.A04, 8, false);
        C301145yd.A07(parcel, 9, this.A08);
        C301145yd.A09(parcel, 10, this.A05);
        C301145yd.A07(parcel, 11, this.A00);
        C301145yd.A07(parcel, 12, this.A01);
        C301145yd.A06(parcel, A032);
    }
}
