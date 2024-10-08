package com.google.android.gms.fido.fido2.api.common;

import X.C301145yd;
import X.C51968G9o;
import X.C51970G9q;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(95);

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1b(false));
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    public final boolean equals(Object obj) {
        return C51970G9q.A1U(obj instanceof zzu ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, false);
        C301145yd.A06(parcel, A03);
    }
}
