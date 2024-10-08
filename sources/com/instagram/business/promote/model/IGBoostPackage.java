package com.instagram.business.promote.model;

import X.JTS;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class IGBoostPackage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(23);
    public ImageUrl A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JTS.A0v(parcel);
    }
}
