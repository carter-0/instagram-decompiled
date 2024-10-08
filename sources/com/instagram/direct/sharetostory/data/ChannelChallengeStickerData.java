package com.instagram.direct.sharetostory.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

public final class ChannelChallengeStickerData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(10);
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;

    public ChannelChallengeStickerData(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, boolean z) {
        0qQ.A0B(str, 1);
        AnonymousClass7TG.A1S(str3, str4);
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = imageUrl;
        this.A0E = list;
        this.A0F = list2;
        this.A08 = num;
        this.A0G = z;
        this.A0B = str6;
        this.A0C = str7;
        this.A09 = str8;
        this.A0A = str9;
        this.A0D = str10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        List list2 = this.A0F;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G2 = C41848B3p.A1G(parcel, list2);
            while (A1G2.hasNext()) {
                C41847B3o.A1I(parcel, A1G2, i);
            }
        }
        AnonymousClass7TG.A16(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0D);
    }
}
