package com.google.android.gms.common;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(51);
    public final Context A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A032 = Pxf.A03(parcel);
        Pxi.A13(parcel, str);
        C301145yd.A09(parcel, 2, this.A02);
        C301145yd.A09(parcel, 3, this.A03);
        C301145yd.A03(new ObjectWrapper(this.A00), parcel, 4);
        C301145yd.A09(parcel, 5, this.A04);
        C301145yd.A09(parcel, 6, this.A05);
        C301145yd.A06(parcel, A032);
    }

    public zzo(IBinder iBinder, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = (Context) ObjectWrapper.A00(IObjectWrapper.Stub.A01(iBinder));
        this.A04 = z3;
        this.A05 = z4;
    }
}
