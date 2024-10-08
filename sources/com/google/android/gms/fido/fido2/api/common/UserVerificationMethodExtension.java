package com.google.android.gms.fido.fido2.api.common;

import X.C51968G9o;
import X.Pxf;
import X.Pxg;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(77);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof UserVerificationMethodExtension) || this.A00 != ((UserVerificationMethodExtension) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1b(this.A00));
    }

    public UserVerificationMethodExtension(boolean z) {
        this.A00 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1E(parcel, Pxf.A03(parcel), this.A00);
    }
}
