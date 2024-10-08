package com.fbpay.w3c;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C249803kO;
import X.C41847B3o;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class CardDetails implements Parcelable, CardDetailsSpec {
    public static final Parcelable.Creator CREATOR = SWW.A00(38);
    public final Address A00;
    public final ImmutableList A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public CardDetails(Address address, ImmutableList immutableList, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = address;
        this.A01 = immutableList;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = bool;
        this.A0A = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardDetails) {
                CardDetails cardDetails = (CardDetails) obj;
                if (!0qQ.A0K(this.A00, cardDetails.A00) || !0qQ.A0K(this.A01, cardDetails.A01) || !0qQ.A0K(this.A05, cardDetails.A05) || !0qQ.A0K(this.A06, cardDetails.A06) || !0qQ.A0K(this.A07, cardDetails.A07) || !0qQ.A0K(this.A08, cardDetails.A08) || !0qQ.A0K(this.A09, cardDetails.A09) || !0qQ.A0K(this.A03, cardDetails.A03) || !0qQ.A0K(this.A04, cardDetails.A04) || !0qQ.A0K(this.A02, cardDetails.A02) || !0qQ.A0K(this.A0A, cardDetails.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A0A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A18(parcel, this.A00, i);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P = Pxi.A0P(parcel, immutableList);
            while (A0P.hasNext()) {
                Pxi.A15(parcel, A0P);
            }
        }
        Pxj.A1B(parcel, this.A05, 0, 1);
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        Pxj.A1B(parcel, this.A08, 0, 1);
        Pxj.A1B(parcel, this.A09, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        C41848B3p.A1I(parcel, this.A02);
        Pxj.A1B(parcel, this.A0A, 0, 1);
    }

    public CardDetails(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Address) parcel.readParcelable(A0W);
        }
        boolean z = false;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A01 = ImmutableList.copyOf((Object[]) strArr);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = C41847B3o.A12(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = C41847B3o.A12(parcel);
        }
        if (parcel.readInt() != 0) {
            bool = Boolean.valueOf(parcel.readInt() == 1 ? true : z);
        }
        this.A02 = bool;
        this.A0A = Pxi.A0e(parcel);
    }
}
