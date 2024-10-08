package com.google.android.gms.fido.fido2.api.common;

import X.C51968G9o;
import X.Pxf;
import X.Pxg;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(83);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsCredPropsOutputs) || this.A00 != ((AuthenticationExtensionsCredPropsOutputs) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1b(this.A00));
    }

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.A00 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1E(parcel, Pxf.A03(parcel), this.A00);
    }
}
