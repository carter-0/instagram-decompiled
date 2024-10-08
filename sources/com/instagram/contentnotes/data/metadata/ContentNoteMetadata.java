package com.instagram.contentnotes.data.metadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class ContentNoteMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(97);
    public final ImageUrl A00;
    public final User A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        parcel.writeString(this.A05);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    public ContentNoteMetadata(ImageUrl imageUrl, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C51972G9s.A1B(str, str4);
        0qQ.A0B(user, 10);
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A0A = str6;
        this.A03 = num;
        this.A05 = str7;
        this.A02 = num2;
        this.A01 = user;
        this.A00 = imageUrl;
        this.A0B = z;
    }
}
