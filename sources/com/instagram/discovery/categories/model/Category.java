package com.instagram.discovery.categories.model;

import X.Pxf;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class Category implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(23);
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        return this.A01.equals(((Category) obj).A01);
    }

    public final int hashCode() {
        return Pxf.A08(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
