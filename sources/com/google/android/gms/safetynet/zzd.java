package com.google.android.gms.safetynet;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(70);
    public final int A00;
    public final long A01;
    public final HarmfulAppsData[] A02;
    public final boolean A03;

    public zzd(HarmfulAppsData[] harmfulAppsDataArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = harmfulAppsDataArr;
        this.A03 = z;
        this.A00 = !z ? -1 : i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A08(parcel, 2, this.A01);
        C301145yd.A0G(parcel, this.A02, 3, i);
        C301145yd.A07(parcel, 4, this.A00);
        C301145yd.A09(parcel, 5, this.A03);
        C301145yd.A06(parcel, A032);
    }
}
