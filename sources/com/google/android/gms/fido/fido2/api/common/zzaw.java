package com.google.android.gms.fido.fido2.api.common;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(73);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaw)) {
            return false;
        }
        return SA1.A01(this.A00, ((zzaw) obj).A00);
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A03 = Pxf.A03(parcel);
        Pxi.A13(parcel, str);
        C301145yd.A06(parcel, A03);
    }

    public zzaw(String str) {
        this.A00 = str;
    }
}
