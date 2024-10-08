package com.instagram.creation.genai.magicmod.model;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class MagicModTopicInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(43);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public MagicModTopicInfo(String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
