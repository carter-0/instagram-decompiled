package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.C249803kO;
import X.C51971G9r;
import X.C8946RGo;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.RF3;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class FbPayNewCreditCardOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(27);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public FbPayNewCreditCardOption(String str) {
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewCreditCardOption) {
                FbPayNewCreditCardOption fbPayNewCreditCardOption = (FbPayNewCreditCardOption) obj;
                if (!0qQ.A0K(this.A01, fbPayNewCreditCardOption.A01) || !0qQ.A0K(this.A03, fbPayNewCreditCardOption.A03) || !0qQ.A0K(this.A02, fbPayNewCreditCardOption.A02) || !0qQ.A0K(this.A00, fbPayNewCreditCardOption.A00) || !0qQ.A0K(this.A04, fbPayNewCreditCardOption.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C11367SPk.A01(this.A01) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P = Pxi.A0P(parcel, immutableList);
            while (A0P.hasNext()) {
                parcel.writeParcelable((FbPayAdditionalField) A0P.next(), i);
            }
        }
        Pxj.A1B(parcel, this.A03, 0, 1);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P2 = Pxi.A0P(parcel, immutableList2);
            while (A0P2.hasNext()) {
                parcel.writeInt(((RF3) A0P2.next()).ordinal());
            }
        }
        ImmutableList immutableList3 = this.A00;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P3 = Pxi.A0P(parcel, immutableList3);
            while (A0P3.hasNext()) {
                parcel.writeInt(((C8946RGo) A0P3.next()).ordinal());
            }
        }
        Pxj.A1B(parcel, this.A04, 0, 1);
    }

    public FbPayNewCreditCardOption(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            Object[] objArr = new FbPayAdditionalField[readInt];
            for (int i = 0; i < readInt; i++) {
                objArr[i] = parcel.readParcelable(A0W);
            }
            this.A01 = ImmutableList.copyOf(objArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            RF3[] rf3Arr = new RF3[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                rf3Arr[i2] = RF3.values()[parcel.readInt()];
            }
            this.A02 = ImmutableList.copyOf((Object[]) rf3Arr);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            C8946RGo[] rGoArr = new C8946RGo[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                rGoArr[i3] = C8946RGo.values()[parcel.readInt()];
            }
            immutableList = ImmutableList.copyOf((Object[]) rGoArr);
        }
        this.A00 = immutableList;
        this.A04 = Pxi.A0e(parcel);
    }
}
