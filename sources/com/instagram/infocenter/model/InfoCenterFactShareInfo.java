package com.instagram.infocenter.model;

import X.AnonymousClass05K;
import X.VED;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class InfoCenterFactShareInfo implements InfoCenterFactShareInfoIntf {
    public static final Parcelable.Creator CREATOR = new W6E(78);
    public Integer A00 = AnonymousClass05K.A01;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;

    public final int describeContents() {
        return 0;
    }

    public final ExtendedImageUrl Ale() {
        return new ExtendedImageUrl(this.A04, Integer.parseInt(this.A05), Integer.parseInt(this.A03));
    }

    public final ExtendedImageUrl BCg() {
        return new ExtendedImageUrl(this.A0D, Integer.parseInt(this.A0E), Integer.parseInt(this.A0C));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(VED.A00(this.A00));
        parcel.writeString(this.A0A);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A08);
    }
}
