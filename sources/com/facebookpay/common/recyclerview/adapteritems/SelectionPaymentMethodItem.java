package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13930TlY;
import X.C21267XRm;
import X.C51974G9v;
import X.C8935RGd;
import X.C8946RGo;
import X.Pxj;
import X.QRJ;
import X.RH6;
import X.S9Z;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionPaymentMethodItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(16);
    public QRJ A00;
    public C8935RGd A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final C13930TlY A08;
    public final C21267XRm A09;
    public final C8946RGo A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final RH6 A0L;
    public final boolean A0M;

    public final void Ejn(Integer num) {
        0qQ.A0B(num, 0);
        this.A03 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A0L);
        parcel.writeString(S9Z.A01(this.A03));
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        Pxj.A1A(parcel, this.A01);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0E);
        parcel.writeValue(this.A08);
        Pxj.A1A(parcel, this.A0A);
        parcel.writeString(this.A0C);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeValue(this.A00);
        AnonymousClass7TE.A1T(parcel, this.A09);
        parcel.writeString(this.A0D);
        AnonymousClass7TG.A16(parcel, this.A0B, 0, 1);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A0L;
    }

    public final Integer Bs1() {
        return this.A03;
    }

    public final String getId() {
        return this.A0F;
    }

    public SelectionPaymentMethodItem(QRJ qrj, RH6 rh6, C13930TlY tlY, C21267XRm xRm, C8935RGd rGd, C8946RGo rGo, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C51974G9v.A1P(rh6, num, str, str2);
        0qQ.A0B(str3, 5);
        0qQ.A0B(xRm, 14);
        String str10 = str7;
        0qQ.A0B(str10, 15);
        this.A0L = rh6;
        this.A03 = num;
        this.A0F = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = rGd;
        this.A0I = str4;
        this.A0E = str5;
        this.A08 = tlY;
        this.A0A = rGo;
        this.A0C = str6;
        this.A02 = num2;
        this.A00 = qrj;
        this.A09 = xRm;
        this.A0D = str10;
        this.A0B = num3;
        this.A06 = z;
        this.A0J = z2;
        this.A0M = z3;
        this.A0G = str8;
        this.A0H = str9;
        this.A0K = z4;
        this.A07 = z5;
    }
}
