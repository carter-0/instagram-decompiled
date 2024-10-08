package com.google.android.gms.auth.api.proxy;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(7);
    public final int A00;
    public final int A01;
    public final int A02;
    public final PendingIntent A03;
    public final Bundle A04;
    public final byte[] A05;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        boolean A1R = Pxi.A1R(parcel, this.A03, i);
        C301145yd.A07(parcel, 3, this.A01);
        C301145yd.A02(this.A04, parcel, 4);
        C301145yd.A0F(parcel, this.A05, 5, A1R);
        Pxf.A17(parcel, this.A02, A06);
    }

    public ProxyResponse(PendingIntent pendingIntent, Bundle bundle, byte[] bArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = bundle;
        this.A05 = bArr;
        this.A03 = pendingIntent;
    }
}
