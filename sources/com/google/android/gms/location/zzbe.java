package com.google.android.gms.location;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(57);
    public final PendingIntent A00;
    public final String A01;
    public final List A02;

    public zzbe(PendingIntent pendingIntent, String str, List list) {
        List unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A00 = pendingIntent;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0D(parcel, this.A02, 1);
        C301145yd.A0A(parcel, this.A00, 2, i, false);
        Pxf.A1A(parcel, this.A01, A03, false);
    }
}
