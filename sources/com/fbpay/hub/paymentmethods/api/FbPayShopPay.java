package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C51968G9o;
import X.C51971G9r;
import X.Pxg;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class FbPayShopPay implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(32);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final long A03;
    public final String A04;

    public FbPayShopPay(long j, String str, String str2, String str3, boolean z) {
        this.A03 = j;
        C11367SPk.A03(str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = str;
        this.A02 = z;
        C11367SPk.A03(str2, "shopPayUserId");
        this.A04 = str2;
        C11367SPk.A03(str3, "shopPayUsername");
        this.A01 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayShopPay) {
                FbPayShopPay fbPayShopPay = (FbPayShopPay) obj;
                if (this.A03 != fbPayShopPay.A03 || !0qQ.A0K(this.A00, fbPayShopPay.A00) || this.A02 != fbPayShopPay.A02 || !0qQ.A0K(this.A04, fbPayShopPay.A04) || !0qQ.A0K(this.A01, fbPayShopPay.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C11367SPk.A00(((C51968G9o.A03(this.A03) + 31) * 31) + C51971G9r.A0E(this.A00), this.A02) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
    }

    public FbPayShopPay(Parcel parcel) {
        Pxh.A1H(this);
        this.A03 = parcel.readLong();
        this.A00 = parcel.readString();
        this.A02 = Pxg.A1U(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
