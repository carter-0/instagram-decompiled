package com.google.android.gms.vision.face.internal.client;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(91);
    public final int A00;
    public final PointF[] A01;

    public zza(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0G(parcel, this.A01, 2, i);
        C301145yd.A07(parcel, 3, this.A00);
        C301145yd.A06(parcel, A03);
    }
}
