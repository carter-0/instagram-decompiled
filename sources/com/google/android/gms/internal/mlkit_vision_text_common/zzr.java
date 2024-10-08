package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(37);
    public final float A00;
    public final zzf A01;
    public final zzf A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzn[] A06;

    public zzr(zzf zzf, zzf zzf2, String str, String str2, zzn[] zznArr, float f, boolean z) {
        this.A06 = zznArr;
        this.A01 = zzf;
        this.A02 = zzf2;
        this.A03 = str;
        this.A00 = f;
        this.A04 = str2;
        this.A05 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0G(parcel, this.A06, 2, i);
        C301145yd.A0A(parcel, this.A01, 3, i, false);
        C301145yd.A0A(parcel, this.A02, 4, i, false);
        C301145yd.A0C(parcel, this.A03, 5, false);
        C301145yd.A04(parcel, this.A00, 6);
        C301145yd.A0C(parcel, this.A04, 7, false);
        C301145yd.A09(parcel, 8, this.A05);
        C301145yd.A06(parcel, A032);
    }
}
