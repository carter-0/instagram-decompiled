package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(29);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final zzf A04;
    public final zzf A05;
    public final zzf A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final zzr[] A0A;

    public zzl(zzf zzf, zzf zzf2, zzf zzf3, String str, String str2, zzr[] zzrArr, float f, int i, int i2, int i3, boolean z) {
        this.A0A = zzrArr;
        this.A04 = zzf;
        this.A05 = zzf2;
        this.A06 = zzf3;
        this.A07 = str;
        this.A00 = f;
        this.A08 = str2;
        this.A01 = i;
        this.A09 = z;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0G(parcel, this.A0A, 2, i);
        C301145yd.A0A(parcel, this.A04, 3, i, false);
        C301145yd.A0A(parcel, this.A05, 4, i, false);
        C301145yd.A0A(parcel, this.A06, 5, i, false);
        C301145yd.A0C(parcel, this.A07, 6, false);
        C301145yd.A04(parcel, this.A00, 7);
        C301145yd.A0C(parcel, this.A08, 8, false);
        C301145yd.A07(parcel, 9, this.A01);
        C301145yd.A09(parcel, 10, this.A09);
        C301145yd.A07(parcel, 11, this.A02);
        C301145yd.A07(parcel, 12, this.A03);
        C301145yd.A06(parcel, A032);
    }
}
