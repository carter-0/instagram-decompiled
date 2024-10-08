package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.RFK;
import X.RH6;
import X.S9Z;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class SelectionShippingAddressItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(20);
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final RH6 A0I;

    public final void Ejn(Integer num) {
        0qQ.A0B(num, 0);
        this.A01 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A0I);
        parcel.writeString(S9Z.A01(this.A01));
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A09);
        List list = this.A06;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (RFK) A1G.next());
        }
    }

    public final RH6 BJZ() {
        return this.A0I;
    }

    public final Integer Bs1() {
        return this.A01;
    }

    public final String getId() {
        return this.A0A;
    }

    public SelectionShippingAddressItem(RH6 rh6, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, boolean z) {
        AnonymousClass7TG.A1U(rh6, num, str);
        this.A0I = rh6;
        this.A01 = num;
        this.A0A = str;
        this.A0E = str2;
        this.A0F = str3;
        this.A0B = str4;
        this.A0G = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A08 = str8;
        this.A0C = str9;
        this.A03 = str10;
        this.A02 = str11;
        this.A04 = str12;
        this.A00 = num2;
        this.A05 = str13;
        this.A0H = z;
        this.A09 = str14;
        this.A06 = list;
    }
}
