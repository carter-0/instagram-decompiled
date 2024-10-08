package com.instagram.nux.cal.model;

import X.1XP;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class ConnectContent extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(60);
    public ImageUrl A00;
    public FXCalAgeRestrictionScreenContent A01;
    public FxAccountInfo A02;
    public FxAccountInfo A03;
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
    public List A0I;
    public List A0J;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    public final SignupContent A00() {
        String str = this.A0C;
        List list = this.A0I;
        String str2 = this.A0A;
        String str3 = this.A0B;
        String str4 = this.A0F;
        String str5 = this.A0G;
        String str6 = this.A0E;
        String str7 = this.A0H;
        ? obj = new Object();
        obj.A07 = list;
        obj.A02 = str;
        obj.A00 = str2;
        obj.A01 = str3;
        obj.A04 = str4;
        obj.A05 = str5;
        obj.A03 = str6;
        obj.A06 = str7;
        return obj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        List list = this.A0I;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        List<ContentText> list2 = this.A0I;
        if (list2 != null) {
            for (ContentText writeParcelable : list2) {
                parcel.writeParcelable(writeParcelable, 0);
            }
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A04);
        List list3 = this.A0J;
        if (list3 != null) {
            i3 = list3.size();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        List<FxAccountInfo> list4 = this.A0J;
        if (list4 != null) {
            for (FxAccountInfo writeParcelable2 : list4) {
                parcel.writeParcelable(writeParcelable2, 0);
            }
        }
        parcel.writeParcelable(this.A01, 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0H);
    }
}
