package com.instagram.nux.cal.model;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class FxAccountInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(65);
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }
}
