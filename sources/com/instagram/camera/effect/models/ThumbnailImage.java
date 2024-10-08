package com.instagram.camera.effect.models;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(65);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
