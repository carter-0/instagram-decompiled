package com.instagram.contentnotes.data.immersive.params;

import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContentNotesImmersiveMimicryParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(96);
    public final int A00;
    public final ContentNotesCoordinates A01;
    public final boolean A02;

    public ContentNotesImmersiveMimicryParams(ContentNotesCoordinates contentNotesCoordinates, int i, boolean z) {
        0qQ.A0B(contentNotesCoordinates, 2);
        this.A02 = z;
        this.A01 = contentNotesCoordinates;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
