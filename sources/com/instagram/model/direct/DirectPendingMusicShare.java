package com.instagram.model.direct;

import X.0qQ;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class DirectPendingMusicShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(35);
    public ExtendedImageUrl A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
