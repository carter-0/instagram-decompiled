package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(28);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public zzf(int i, int i2, int i3, int i4, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A07(parcel, 3, this.A02);
        C301145yd.A07(parcel, 4, this.A03);
        C301145yd.A07(parcel, 5, this.A04);
        C301145yd.A04(parcel, this.A00, 6);
        C301145yd.A06(parcel, A032);
    }
}
