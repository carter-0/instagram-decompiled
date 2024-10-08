package com.google.android.gms.auth.api.signin.internal;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(8);
    public int A00;
    public Bundle A01;
    public final int A02;

    public GoogleSignInOptionsExtensionParcelable(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A02);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A02(this.A01, parcel, 3);
        C301145yd.A06(parcel, A03);
    }
}
