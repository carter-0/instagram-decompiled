package com.instagram.direct.sharetostory.data;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class JoinChatStickerData extends ShareToStoryStickerData {
    public static final Parcelable.Creator CREATOR = new W6E(11);
    public int A00;
    public int A01;
    public int A02;
    public ImageUrl A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
    }

    public JoinChatStickerData(ImageUrl imageUrl, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str4, 10);
        this.A00 = imageUrl;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A03 = imageUrl;
        this.A01 = i2;
        this.A08 = z;
        this.A0A = z2;
        this.A09 = z3;
        this.A04 = str4;
        this.A02 = i3;
    }
}
