package com.google.android.gms.common.stats;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = SWX.A00(50);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final long A0C;
    public final long A0D;
    public final String A0E;

    public WakeLockEvent(String str, String str2, String str3, String str4, String str5, List list, float f, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z) {
        this.A01 = i;
        this.A05 = j;
        this.A02 = i2;
        this.A06 = str;
        this.A07 = str3;
        this.A08 = str5;
        this.A03 = i3;
        this.A0A = list;
        this.A0E = str2;
        this.A0C = j2;
        this.A04 = i4;
        this.A09 = str4;
        this.A00 = f;
        this.A0D = j3;
        this.A0B = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A01);
        C301145yd.A08(parcel, 2, this.A05);
        C301145yd.A0C(parcel, this.A06, 4, false);
        C301145yd.A07(parcel, 5, this.A03);
        C301145yd.A0D(parcel, this.A0A, 6);
        C301145yd.A08(parcel, 8, this.A0C);
        C301145yd.A0C(parcel, this.A07, 10, false);
        C301145yd.A07(parcel, 11, this.A02);
        C301145yd.A0C(parcel, this.A0E, 12, false);
        C301145yd.A0C(parcel, this.A09, 13, false);
        C301145yd.A07(parcel, 14, this.A04);
        C301145yd.A04(parcel, this.A00, 15);
        C301145yd.A08(parcel, 16, this.A0D);
        C301145yd.A0C(parcel, this.A08, 17, false);
        C301145yd.A09(parcel, 18, this.A0B);
        C301145yd.A06(parcel, A032);
    }
}
