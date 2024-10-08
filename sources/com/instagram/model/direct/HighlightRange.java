package com.instagram.model.direct;

import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class HighlightRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(41);
    public int A00;
    public int A01;
    public int A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
