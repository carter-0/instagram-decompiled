package com.instagram.model.direct;

import X.0qQ;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;

public final class DirectMessageSearchThread implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(33);
    public long A00;
    public long A01;
    public long A02;
    public ImmutableList A03;
    public ImageUrl A04;
    public ImageUrl A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeList(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public final String AEB() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| %-30s | title: %-50s | thread id: %-100s|", "DirectMessageSearchThread", this.A09, this.A08);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
