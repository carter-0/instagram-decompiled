package com.instagram.shopping.intf.featuredproducts;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import java.util.ArrayList;
import java.util.List;

public final class FeaturedProductMediaFeedGridConfiguration implements Parcelable {
    public static final W6F CREATOR = new W6F(39);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        List<FeaturedProductPermissionStatus> list = this.A08;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (FeaturedProductPermissionStatus featuredProductPermissionStatus : list) {
            A0r.add(featuredProductPermissionStatus.A00);
        }
        parcel.writeStringList(A0r);
        parcel.writeStringList(this.A07);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public FeaturedProductMediaFeedGridConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z) {
        C51974G9v.A1P(str, str2, str3, list);
        this.A06 = str;
        this.A00 = str2;
        this.A04 = str3;
        this.A08 = list;
        this.A07 = list2;
        this.A05 = str4;
        this.A09 = z;
        this.A03 = str5;
        this.A02 = str6;
        this.A01 = str7;
    }
}
