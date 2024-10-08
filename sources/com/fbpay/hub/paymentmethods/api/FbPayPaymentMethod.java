package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(31);
    public final int A00;
    public final Uri A01;
    public final FbPayBankAccount A02;
    public final FbPayCreditCard A03;
    public final FbPayPayPal A04;
    public final FbPayShopPay A05;
    public final String A06;
    public final String A07;
    public final FbPayNewCreditCardOption A08;
    public final FbPayNewPayPalOption A09;

    public FbPayPaymentMethod(Uri uri, FbPayBankAccount fbPayBankAccount, FbPayCreditCard fbPayCreditCard, FbPayPayPal fbPayPayPal, FbPayShopPay fbPayShopPay, String str, String str2, int i) {
        this.A02 = fbPayBankAccount;
        this.A03 = fbPayCreditCard;
        this.A04 = fbPayPayPal;
        this.A05 = fbPayShopPay;
        this.A01 = uri;
        this.A08 = null;
        this.A09 = null;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentMethod) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) obj;
                if (!0qQ.A0K(this.A02, fbPayPaymentMethod.A02) || !0qQ.A0K(this.A03, fbPayPaymentMethod.A03) || !0qQ.A0K(this.A04, fbPayPaymentMethod.A04) || !0qQ.A0K(this.A05, fbPayPaymentMethod.A05) || !0qQ.A0K(this.A01, fbPayPaymentMethod.A01) || !0qQ.A0K(this.A08, fbPayPaymentMethod.A08) || !0qQ.A0K(this.A09, fbPayPaymentMethod.A09) || !0qQ.A0K(this.A06, fbPayPaymentMethod.A06) || !0qQ.A0K(this.A07, fbPayPaymentMethod.A07) || this.A00 != fbPayPaymentMethod.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((C11367SPk.A01(this.A02) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07)) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A18(parcel, this.A02, i);
        Pxj.A18(parcel, this.A03, i);
        Pxj.A18(parcel, this.A04, i);
        Pxj.A18(parcel, this.A05, i);
        Pxj.A18(parcel, this.A01, i);
        Pxj.A18(parcel, this.A08, i);
        Pxj.A18(parcel, this.A09, i);
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A00);
    }

    public FbPayPaymentMethod(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FbPayBankAccount) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (FbPayCreditCard) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FbPayPayPal) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbPayShopPay) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (FbPayNewCreditCardOption) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FbPayNewPayPalOption) parcel.readParcelable(A0W);
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = Pxi.A0e(parcel);
        this.A00 = parcel.readInt();
    }
}
