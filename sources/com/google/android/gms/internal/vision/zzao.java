package com.google.android.gms.internal.vision;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(43);
    public final zzab A00;
    public final String A01;
    public final String A02;
    public final float A03;
    public final zzab A04;
    public final boolean A05;
    public final zzal[] A06;

    public zzao(zzab zzab, zzab zzab2, String str, String str2, zzal[] zzalArr, float f, boolean z) {
        this.A06 = zzalArr;
        this.A00 = zzab;
        this.A04 = zzab2;
        this.A01 = str;
        this.A03 = f;
        this.A02 = str2;
        this.A05 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0G(parcel, this.A06, 2, i);
        C301145yd.A0A(parcel, this.A00, 3, i, false);
        C301145yd.A0A(parcel, this.A04, 4, i, false);
        C301145yd.A0C(parcel, this.A01, 5, false);
        C301145yd.A04(parcel, this.A03, 6);
        C301145yd.A0C(parcel, this.A02, 7, false);
        C301145yd.A09(parcel, 8, this.A05);
        C301145yd.A06(parcel, A032);
    }
}
