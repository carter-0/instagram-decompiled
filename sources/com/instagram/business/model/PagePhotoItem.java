package com.instagram.business.model;

import X.C41847B3o;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public class PagePhotoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(12);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public PagePhotoItem(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = (ImageUrl) C41847B3o.A03(parcel, ImageUrl.class);
        this.A03 = Pxg.A1U(parcel);
        this.A01 = parcel.readString();
    }
}
