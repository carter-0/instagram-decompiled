package com.google.mlkit.vision.common.internal;

import X.C301145yd;
import X.Pxf;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(12);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = j;
        this.A01 = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A02);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A07(parcel, 3, this.A03);
        C301145yd.A08(parcel, 4, this.A04);
        C301145yd.A07(parcel, 5, this.A01);
        C301145yd.A06(parcel, A032);
    }
}
