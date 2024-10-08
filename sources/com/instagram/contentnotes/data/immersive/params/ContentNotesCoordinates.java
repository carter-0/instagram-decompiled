package com.instagram.contentnotes.data.immersive.params;

import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContentNotesCoordinates extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(94);
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public ContentNotesCoordinates(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
