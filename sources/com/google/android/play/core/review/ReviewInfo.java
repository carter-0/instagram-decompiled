package com.google.android.play.core.review;

import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(9);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zza zza = (zza) this;
        parcel.writeParcelable(zza.A00, 0);
        parcel.writeInt(zza.A01 ? 1 : 0);
    }
}
