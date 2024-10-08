package com.google.android.gms.auth.api.identity;

import X.Pxf;
import X.Pxg;
import X.SA1;
import X.SWX;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(1);
    public final PendingIntent A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenResult)) {
            return false;
        }
        return SA1.A01(this.A00, ((SaveAccountLinkingTokenResult) obj).A00);
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1F(parcel, this.A00, i, Pxf.A03(parcel));
    }
}
