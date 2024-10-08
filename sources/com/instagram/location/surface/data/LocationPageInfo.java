package com.instagram.location.surface.data;

import X.0qQ;
import X.C41847B3o;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class LocationPageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(5);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public LocationPageInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (ImageUrl) C41847B3o.A03(parcel, ImageUrl.class);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
