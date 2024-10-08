package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(30);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public final void writeToParcel(Parcel parcel, int i) {
        int A062 = Pxi.A06(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A07(parcel, 3, this.A02);
        C301145yd.A08(parcel, 4, this.A05);
        C301145yd.A08(parcel, 5, this.A06);
        C301145yd.A0C(parcel, this.A07, 6, false);
        C301145yd.A0C(parcel, this.A08, 7, false);
        C301145yd.A07(parcel, 8, this.A03);
        C301145yd.A07(parcel, 9, this.A04);
        C301145yd.A06(parcel, A062);
    }

    public MethodInvocation(String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A06 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i4;
        this.A04 = i5;
    }
}
