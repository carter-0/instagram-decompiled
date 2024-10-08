package com.instagram.music.common.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicBrowserCategoryModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(51);
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
