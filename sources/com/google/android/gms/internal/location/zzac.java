package com.google.android.gms.internal.location;

import X.AnonymousClass63X;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzac extends AbstractSafeParcelable implements AnonymousClass63X {
    public static final zzac A01 = new zzac(Status.A08);
    public static final Parcelable.Creator CREATOR = SWR.A00(21);
    public final Status A00;

    public final Status BzI() {
        return this.A00;
    }

    public zzac(Status status) {
        this.A00 = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1F(parcel, this.A00, i, Pxf.A03(parcel));
    }
}
