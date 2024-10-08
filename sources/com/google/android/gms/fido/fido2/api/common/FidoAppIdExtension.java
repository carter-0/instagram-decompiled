package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(97);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoAppIdExtension)) {
            return false;
        }
        return this.A00.equals(((FidoAppIdExtension) obj).A00);
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public final String toString() {
        return 002.A0g("FidoAppIdExtension{appid='", this.A00, "'}");
    }

    public FidoAppIdExtension(String str) {
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }
}
