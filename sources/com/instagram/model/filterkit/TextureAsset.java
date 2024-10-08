package com.instagram.model.filterkit;

import X.00p;
import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class TextureAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(26);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }

    public TextureAsset(String str, String str2) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        boolean A0i = 00p.A0i(lowerCase, ".pkm", false);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = A0i;
    }

    public TextureAsset(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readByte() != 1 ? false : true;
    }
}
