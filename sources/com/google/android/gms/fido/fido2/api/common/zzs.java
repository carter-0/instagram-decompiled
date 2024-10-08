package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C66580MXl;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(94);
    public final List A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((zzs) obj).A00;
        if (!list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A08(C66580MXl.A12(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxi.A16(parcel, this.A00, 1, Pxf.A03(parcel));
    }

    public zzs(List list) {
        AnonymousClass3Qk.A02(list);
        this.A00 = list;
    }
}
