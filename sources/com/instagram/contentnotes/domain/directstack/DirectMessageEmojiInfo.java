package com.instagram.contentnotes.domain.directstack;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C51969G9p;
import X.C51974G9v;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class DirectMessageEmojiInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(98);
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
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;

    public DirectMessageEmojiInfo(ImageUrl imageUrl, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, boolean z) {
        0qQ.A0B(list, 1);
        C51974G9v.A1S(str, str2, str3, str4, str5);
        C51969G9p.A1N(str6, 7, user);
        this.A0D = list;
        this.A0A = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A0C = str4;
        this.A07 = str5;
        this.A0B = str6;
        this.A06 = str7;
        this.A02 = num;
        this.A01 = user;
        this.A09 = str8;
        this.A00 = imageUrl;
        this.A08 = str9;
        this.A03 = num2;
        this.A0E = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0D);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A06);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        parcel.writeInt(this.A0E ? 1 : 0);
    }
}
