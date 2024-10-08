package com.fbpay.hub.orders.api;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C41847B3o;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FBPayOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(23);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;

    public FBPayOrder(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A01 = str;
        this.A02 = str2;
        C11367SPk.A03(str3, "orderId");
        this.A03 = str3;
        C11367SPk.A03(str4, "orderStatus");
        this.A04 = str4;
        this.A00 = num;
        C11367SPk.A03(str5, "orderType");
        this.A05 = str5;
        this.A07 = i;
        this.A06 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayOrder) {
                FBPayOrder fBPayOrder = (FBPayOrder) obj;
                if (!0qQ.A0K(this.A01, fBPayOrder.A01) || !0qQ.A0K(this.A02, fBPayOrder.A02) || !0qQ.A0K(this.A03, fBPayOrder.A03) || !0qQ.A0K(this.A04, fBPayOrder.A04) || !0qQ.A0K(this.A00, fBPayOrder.A00) || !0qQ.A0K(this.A05, fBPayOrder.A05) || this.A07 != fBPayOrder.A07 || !0qQ.A0K(this.A06, fBPayOrder.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A01(this.A01) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A05)) * 31) + this.A07) * 31) + C51971G9r.A0E(this.A06);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07);
        Pxj.A1B(parcel, this.A06, 0, 1);
    }

    public FBPayOrder(Parcel parcel) {
        Integer num = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? C41847B3o.A12(parcel) : num;
        this.A05 = parcel.readString();
        this.A07 = parcel.readInt();
        this.A06 = Pxi.A0e(parcel);
    }
}
