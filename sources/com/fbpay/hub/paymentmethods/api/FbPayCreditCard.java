package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C249803kO;
import X.C41848B3p;
import X.C51971G9r;
import X.C8946RGo;
import X.DbY;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.google.common.collect.ImmutableList;

public class FbPayCreditCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(26);
    public final FBPayAddress A00;
    public final C8946RGo A01;
    public final ImmutableList A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final FbPayPaymentDefaultInfo A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;

    public FbPayCreditCard(FBPayAddress fBPayAddress, C8946RGo rGo, ImmutableList immutableList, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A00 = fBPayAddress;
        this.A02 = immutableList;
        this.A0H = null;
        C11367SPk.A03(rGo, "cardType");
        this.A01 = rGo;
        this.A04 = str;
        this.A05 = str2;
        C11367SPk.A03(str3, "credentialId");
        this.A06 = str3;
        C11367SPk.A03(str4, "expireMonth");
        this.A07 = str4;
        C11367SPk.A03(str5, "expireYear");
        this.A08 = str5;
        C11367SPk.A03(str6, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A09 = str6;
        this.A03 = bool;
        this.A0I = false;
        this.A0F = false;
        this.A0J = false;
        C11367SPk.A03(str7, "lastFourDigits");
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A0D = str10;
        this.A0G = null;
        this.A0E = str11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayCreditCard) {
                FbPayCreditCard fbPayCreditCard = (FbPayCreditCard) obj;
                if (!0qQ.A0K(this.A00, fbPayCreditCard.A00) || !0qQ.A0K(this.A02, fbPayCreditCard.A02) || !0qQ.A0K(this.A0H, fbPayCreditCard.A0H) || this.A01 != fbPayCreditCard.A01 || !0qQ.A0K(this.A04, fbPayCreditCard.A04) || !0qQ.A0K(this.A05, fbPayCreditCard.A05) || !0qQ.A0K(this.A06, fbPayCreditCard.A06) || !0qQ.A0K(this.A07, fbPayCreditCard.A07) || !0qQ.A0K(this.A08, fbPayCreditCard.A08) || !0qQ.A0K(this.A09, fbPayCreditCard.A09) || !0qQ.A0K(this.A03, fbPayCreditCard.A03) || this.A0I != fbPayCreditCard.A0I || this.A0F != fbPayCreditCard.A0F || this.A0J != fbPayCreditCard.A0J || !0qQ.A0K(this.A0A, fbPayCreditCard.A0A) || !0qQ.A0K(this.A0B, fbPayCreditCard.A0B) || !0qQ.A0K(this.A0C, fbPayCreditCard.A0C) || !0qQ.A0K(this.A0D, fbPayCreditCard.A0D) || !0qQ.A0K(this.A0G, fbPayCreditCard.A0G) || !0qQ.A0K(this.A0E, fbPayCreditCard.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A012 = (((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A0H);
        C8946RGo rGo = this.A01;
        if (rGo == null) {
            ordinal = -1;
        } else {
            ordinal = rGo.ordinal();
        }
        return (((((((((((C11367SPk.A00(C11367SPk.A00(C11367SPk.A00((((((((((((((((A012 * 31) + ordinal) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A03), this.A0I), this.A0F), this.A0J) * 31) + C51971G9r.A0E(this.A0A)) * 31) + C51971G9r.A0E(this.A0B)) * 31) + C51971G9r.A0E(this.A0C)) * 31) + C51971G9r.A0E(this.A0D)) * 31) + C51971G9r.A0E(this.A0G)) * 31) + C51971G9r.A0E(this.A0E);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        FBPayAddress fBPayAddress = this.A00;
        if (fBPayAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fBPayAddress.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P = Pxi.A0P(parcel, immutableList);
            while (A0P.hasNext()) {
                Pxi.A15(parcel, A0P);
            }
        }
        Pxj.A1B(parcel, this.A0H, 0, 1);
        parcel.writeInt(this.A01.ordinal());
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        C41848B3p.A1I(parcel, this.A03);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0A);
        Pxj.A1B(parcel, this.A0B, 0, 1);
        Pxj.A1B(parcel, this.A0C, 0, 1);
        Pxj.A1B(parcel, this.A0D, 0, 1);
        Pxj.A18(parcel, this.A0G, i);
        Pxj.A1B(parcel, this.A0E, 0, 1);
    }

    public FbPayCreditCard(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FBPayAddress) FBPayAddress.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A02 = ImmutableList.copyOf((Object[]) strArr);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A01 = C8946RGo.values()[parcel.readInt()];
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
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(DbY.A1X(parcel));
        }
        this.A0I = DbY.A1X(parcel);
        this.A0F = DbY.A1X(parcel);
        this.A0J = Pxg.A1V(parcel);
        this.A0A = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0G = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0W) : fbPayPaymentDefaultInfo;
        this.A0E = Pxi.A0e(parcel);
    }
}
