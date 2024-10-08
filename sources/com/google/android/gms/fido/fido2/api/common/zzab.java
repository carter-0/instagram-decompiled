package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(58);
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzab) || this.A00 != ((zzab) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A08(Long.valueOf(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A03 = Pxf.A03(parcel);
        C301145yd.A08(parcel, 1, j);
        C301145yd.A06(parcel, A03);
    }

    public zzab(long j) {
        Long valueOf = Long.valueOf(j);
        AnonymousClass3Qk.A02(valueOf);
        this.A00 = valueOf.longValue();
    }
}
