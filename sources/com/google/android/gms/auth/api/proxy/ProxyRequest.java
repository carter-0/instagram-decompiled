package com.google.android.gms.auth.api.proxy;

import X.002;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(6);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Bundle A03;
    public final String A04;
    public final byte[] A05;

    public final String toString() {
        return 002.A09(this.A00, "ProxyRequest[ url: ", this.A04, ", method: ", " ]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A04;
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, str);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A08(parcel, 3, this.A02);
        C301145yd.A0F(parcel, this.A05, 4, A1S);
        C301145yd.A02(this.A03, parcel, 5);
        Pxf.A17(parcel, this.A01, A032);
    }

    public ProxyRequest(Bundle bundle, String str, byte[] bArr, int i, int i2, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A00 = i2;
        this.A02 = j;
        this.A05 = bArr;
        this.A03 = bundle;
    }
}
