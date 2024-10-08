package com.google.android.gms.location;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(53);
    public zzay A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public LocationSettingsRequest(zzay zzay, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = zzay;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, Collections.unmodifiableList(this.A01), 1, false);
        C301145yd.A09(parcel, 2, this.A02);
        C301145yd.A09(parcel, 3, this.A03);
        C301145yd.A0A(parcel, this.A00, 5, i, false);
        C301145yd.A06(parcel, A032);
    }
}
