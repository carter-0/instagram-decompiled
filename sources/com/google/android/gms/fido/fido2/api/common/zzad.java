package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C51968G9o;
import X.Pxf;
import X.Pxg;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(59);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad) || this.A00 != ((zzad) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1b(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1E(parcel, Pxf.A03(parcel), this.A00);
    }

    public zzad(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass3Qk.A02(valueOf);
        this.A00 = valueOf.booleanValue();
    }
}
