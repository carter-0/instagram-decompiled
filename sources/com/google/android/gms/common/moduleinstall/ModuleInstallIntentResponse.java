package com.google.android.gms.common.moduleinstall;

import X.Pxf;
import X.Pxg;
import X.SWX;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(38);
    public final PendingIntent A00;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1F(parcel, this.A00, i, Pxf.A03(parcel));
    }
}
