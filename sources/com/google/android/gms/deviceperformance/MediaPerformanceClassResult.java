package com.google.android.gms.deviceperformance;

import X.0qQ;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class MediaPerformanceClassResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(54);
    public final int A00;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }

    public MediaPerformanceClassResult(int i) {
        this.A00 = i;
    }
}
