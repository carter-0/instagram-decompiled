package com.google.android.gms.location;

import X.AnonymousClass63X;
import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsResult extends AbstractSafeParcelable implements AnonymousClass63X {
    public static final Parcelable.Creator CREATOR = SWR.A00(54);
    public final Status A00;
    public final LocationSettingsStates A01;

    public final Status BzI() {
        return this.A00;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.A00 = status;
        this.A01 = locationSettingsStates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A00, 1, i, false);
        C301145yd.A0A(parcel, this.A01, 2, i, false);
        C301145yd.A06(parcel, A03);
    }
}
