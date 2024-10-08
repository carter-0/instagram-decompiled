package com.google.android.gms.common.internal;

import X.002;
import X.C301145yd;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(28);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ClientIdentity) {
                ClientIdentity clientIdentity = (ClientIdentity) obj;
                if (clientIdentity.A00 != this.A00 || !SA1.A01(clientIdentity.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A04(this.A00, ":", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A06(parcel, A06);
    }

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
