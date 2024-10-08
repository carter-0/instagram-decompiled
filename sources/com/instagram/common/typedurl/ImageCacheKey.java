package com.instagram.common.typedurl;

import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public class ImageCacheKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(76);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCacheKey) || !((ImageCacheKey) obj).A03.equals(this.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public ImageCacheKey(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
    }

    public ImageCacheKey(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A03 = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A02 = readString2;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }
}
