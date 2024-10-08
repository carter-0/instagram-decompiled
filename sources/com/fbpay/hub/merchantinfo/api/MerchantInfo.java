package com.fbpay.hub.merchantinfo.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class MerchantInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(22);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MerchantInfo) {
                MerchantInfo merchantInfo = (MerchantInfo) obj;
                if (!0qQ.A0K(this.A00, merchantInfo.A00) || !0qQ.A0K(this.A01, merchantInfo.A01) || !0qQ.A0K(this.A02, merchantInfo.A02) || !0qQ.A0K(this.A04, merchantInfo.A04) || !0qQ.A0K(this.A03, merchantInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public MerchantInfo(Parcel parcel) {
        Pxh.A1H(this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
