package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.Pxf;
import X.Pxg;
import X.SWW;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(93);
    public final PendingIntent A00;

    public BeginSignInResult(PendingIntent pendingIntent) {
        AnonymousClass3Qk.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1F(parcel, this.A00, i, Pxf.A03(parcel));
    }
}
