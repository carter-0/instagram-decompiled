package com.instagram.shopping.intf.productpicker;

import X.0qQ;
import X.C16581Uxb;
import X.C18267Voh;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ProductPickerArguments implements Parcelable {
    public static final W6F CREATOR = new W6F(41);
    public final C16581Uxb A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(C18267Voh.A00(this.A01));
        parcel.writeString(this.A02);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeTypedList(this.A08);
        parcel.writeTypedList(this.A07);
        parcel.writeStringList(this.A09);
        C16581Uxb uxb = this.A00;
        if (uxb != null) {
            str = uxb.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeString(this.A06);
    }

    public ProductPickerArguments(C16581Uxb uxb, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = num;
        this.A02 = str;
        this.A0D = z;
        this.A05 = str2;
        this.A0A = z2;
        this.A03 = str3;
        this.A04 = str4;
        this.A08 = list;
        this.A07 = list2;
        this.A09 = list3;
        this.A00 = uxb;
        this.A0C = z3;
        this.A0B = z4;
        this.A06 = str5;
    }
}
