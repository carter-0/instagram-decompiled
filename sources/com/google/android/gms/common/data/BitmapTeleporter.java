package com.google.android.gms.common.data;

import X.AnonymousClass00P;
import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(25);
    public ParcelFileDescriptor A00;
    public final int A01;
    public final int A02;

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            AnonymousClass3Qk.A02((Object) null);
            throw AnonymousClass00P.createAndThrow();
        }
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A01);
        C301145yd.A0A(parcel, this.A00, 2, i | 1, false);
        C301145yd.A07(parcel, 3, this.A02);
        C301145yd.A06(parcel, A03);
        this.A00 = null;
    }

    public BitmapTeleporter(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        this.A01 = i;
        this.A00 = parcelFileDescriptor;
        this.A02 = i2;
    }
}
