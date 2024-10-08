package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass7TF;
import X.C11367SPk;
import X.DbY;
import X.Pxg;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayPaymentDefaultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(30);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentDefaultInfo) {
                FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = (FbPayPaymentDefaultInfo) obj;
                if (!(this.A00 == fbPayPaymentDefaultInfo.A00 && this.A01 == fbPayPaymentDefaultInfo.A01 && this.A02 == fbPayPaymentDefaultInfo.A02 && this.A03 == fbPayPaymentDefaultInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(i + 31, this.A01), this.A02), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public FbPayPaymentDefaultInfo(Parcel parcel) {
        this.A00 = AnonymousClass7TF.A1S(Pxj.A0A(parcel, this), 1);
        this.A01 = DbY.A1X(parcel);
        this.A02 = DbY.A1X(parcel);
        this.A03 = Pxg.A1V(parcel);
    }
}
