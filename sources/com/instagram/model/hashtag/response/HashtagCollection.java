package com.instagram.model.hashtag.response;

import X.1XP;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class HashtagCollection extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(56);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeList(this.A00);
    }
}
