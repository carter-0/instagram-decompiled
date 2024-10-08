package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.Pxg;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class FbPayPayPal implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(29);
    public final String A00;
    public final String A01;
    public final String A02;
    public final FbPayPaymentDefaultInfo A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public FbPayPayPal(String str, String str2, String str3) {
        this.A04 = null;
        this.A05 = null;
        this.A08 = false;
        this.A06 = null;
        this.A07 = null;
        C11367SPk.A03(str, "credentialId");
        this.A00 = str;
        C11367SPk.A03(str2, "email");
        this.A01 = str2;
        C11367SPk.A03(str3, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A02 = str3;
        this.A09 = false;
        this.A03 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPayPal) {
                FbPayPayPal fbPayPayPal = (FbPayPayPal) obj;
                if (!0qQ.A0K(this.A04, fbPayPayPal.A04) || !0qQ.A0K(this.A05, fbPayPayPal.A05) || this.A08 != fbPayPayPal.A08 || !0qQ.A0K(this.A06, fbPayPayPal.A06) || !0qQ.A0K(this.A07, fbPayPayPal.A07) || !0qQ.A0K(this.A00, fbPayPayPal.A00) || !0qQ.A0K(this.A01, fbPayPayPal.A01) || !0qQ.A0K(this.A02, fbPayPayPal.A02) || this.A09 != fbPayPayPal.A09 || !0qQ.A0K(this.A03, fbPayPayPal.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A00((((((((((C11367SPk.A00((C11367SPk.A01(this.A04) * 31) + C51971G9r.A0E(this.A05), this.A08) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02), this.A09) * 31) + C51971G9r.A0E(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A08 ? 1 : 0);
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A09 ? 1 : 0);
        Pxj.A18(parcel, this.A03, i);
    }

    public FbPayPayPal(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A08 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A09 = Pxg.A1V(parcel);
        this.A03 = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0W) : fbPayPaymentDefaultInfo;
    }
}
