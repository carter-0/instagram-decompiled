package com.instagram.discovery.mediamap.model;

import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class MediaMapPinPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(34);
    public ImageUrl A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
