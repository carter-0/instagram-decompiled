package com.google.android.gms.auth.blockstore;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(17);
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.A02 = bArr;
        this.A01 = z;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0F(parcel, this.A02, 1, false);
        C301145yd.A09(parcel, 2, this.A01);
        Pxf.A1A(parcel, this.A00, A03, false);
    }
}
