package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class GallerySuggestionsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(24);
    public int A00 = 0;
    public String A01 = "";
    public String A02 = "";

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
