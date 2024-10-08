package com.instagram.direct.model.textformatting;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormattedText implements Parcelable {
    public static final LVP CREATOR = LVP.A00(96);
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
