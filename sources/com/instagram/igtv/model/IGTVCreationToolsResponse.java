package com.instagram.igtv.model;

import X.0qQ;
import X.1XP;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.video.ShoppingCreationConfig;

public final class IGTVCreationToolsResponse extends 1XP implements Parcelable {
    public static final W6E CREATOR = new W6E(73);
    public ShoppingCreationConfig A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
