package com.google.android.gms.internal.p002authapi;

import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.internal.auth-api.zbu  reason: invalid package */
public final class zbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(12);
    public final Credential A00;

    public zbu(Credential credential) {
        this.A00 = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1F(parcel, this.A00, i, Pxf.A03(parcel));
    }
}
