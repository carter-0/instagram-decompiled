package com.instagram.login.api;

import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public class AssistAccountRecoveryResponse$UhlAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(6);
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
