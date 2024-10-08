package com.fbpay.w3c;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C11367SPk;
import X.C41847B3o;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class W3CCardDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(42);
    public final CardDetails A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W3CCardDetail) {
                W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
                if (!0qQ.A0K(this.A00, w3CCardDetail.A00) || this.A05 != w3CCardDetail.A05 || !0qQ.A0K(this.A01, w3CCardDetail.A01) || !0qQ.A0K(this.A02, w3CCardDetail.A02) || !0qQ.A0K(this.A03, w3CCardDetail.A03) || !0qQ.A0K(this.A04, w3CCardDetail.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C11367SPk.A00(C11367SPk.A01(this.A00), this.A05) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        C41848B3p.A1I(parcel, this.A01);
        parcel.writeString(this.A02);
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
    }

    public W3CCardDetail(Parcel parcel) {
        this.A00 = (CardDetails) C41847B3o.A03(parcel, getClass());
        this.A05 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(Pxg.A1V(parcel));
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = Pxi.A0e(parcel);
    }

    public W3CCardDetail(CardDetails cardDetails, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A00 = cardDetails;
        this.A05 = z;
        this.A01 = bool;
        C11367SPk.A03(str, "latestBoundDevice");
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }
}
