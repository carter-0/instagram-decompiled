package com.fbpay.hub.common.link;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxg;
import X.Pxj;
import X.SR9;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class LinkParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(17);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkParams) {
                LinkParams linkParams = (LinkParams) obj;
                if (!(this.A00 == linkParams.A00 && this.A01 == linkParams.A01 && this.A02 == linkParams.A02 && 0qQ.A0K(this.A03, linkParams.A03) && 0qQ.A0K(this.A04, linkParams.A04) && this.A05 == linkParams.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C11367SPk.A00(((((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04), this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public LinkParams(SR9 sr9) {
        this.A00 = sr9.A00;
        this.A01 = sr9.A01;
        this.A02 = sr9.A02;
        String str = sr9.A03;
        C11367SPk.A03(str, "token");
        this.A03 = str;
        String str2 = sr9.A04;
        C11367SPk.A03(str2, "url");
        this.A04 = str2;
        this.A05 = sr9.A05;
    }

    public LinkParams(Parcel parcel) {
        this.A00 = Pxj.A0A(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = Pxg.A1U(parcel);
    }
}
