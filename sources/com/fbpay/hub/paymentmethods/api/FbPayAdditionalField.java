package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C249803kO;
import X.C51971G9r;
import X.Pxh;
import X.Pxi;
import X.REF;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class FbPayAdditionalField implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(24);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayAdditionalField) {
                FbPayAdditionalField fbPayAdditionalField = (FbPayAdditionalField) obj;
                if (!0qQ.A0K(this.A01, fbPayAdditionalField.A01) || !0qQ.A0K(this.A00, fbPayAdditionalField.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A01) * 31) + C51971G9r.A0E(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C249803kO A0P = Pxi.A0P(parcel, this.A00);
        while (A0P.hasNext()) {
            parcel.writeInt(((REF) A0P.next()).ordinal());
        }
    }

    public FbPayAdditionalField(Parcel parcel) {
        Pxh.A1H(this);
        this.A01 = parcel.readString();
        int readInt = parcel.readInt();
        REF[] refArr = new REF[readInt];
        for (int i = 0; i < readInt; i++) {
            refArr[i] = REF.values()[parcel.readInt()];
        }
        this.A00 = ImmutableList.copyOf((Object[]) refArr);
    }
}
