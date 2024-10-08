package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(61);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzag)) {
            return false;
        }
        return this.A00.equals(((zzag) obj).A00);
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

    public zzag(String str) {
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
    }
}
