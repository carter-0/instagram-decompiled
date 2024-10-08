package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(29);
    public List A00;
    public final int A01;

    public TelemetryData(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A01);
        Pxi.A16(parcel, this.A00, 2, A03);
    }
}
