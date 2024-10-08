package com.instagram.tagging.api.model;

import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;

public final class MediaSuggestedProductTagProductItemContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(72);
    public float A00;
    public ProductDetailsProductItemDict A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeFloat(this.A00);
    }
}
