package com.facebookpay.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C11249SHj;
import X.C11367SPk;
import X.C2818159r;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FBPayLoggerData implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = SWW.A00(4);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayLoggerData) {
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
                if (!0qQ.A0K(this.A05, fBPayLoggerData.A05) || !0qQ.A0K(this.A00, fBPayLoggerData.A00) || !0qQ.A0K(this.A01, fBPayLoggerData.A01) || !0qQ.A0K(this.A06, fBPayLoggerData.A06) || !0qQ.A0K(this.A02, fBPayLoggerData.A02) || !0qQ.A0K(this.A03, fBPayLoggerData.A03) || !0qQ.A0K(A00(), fBPayLoggerData.A00()) || !0qQ.A0K(this.A04, fBPayLoggerData.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        if (this.A08.contains("sessionId")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = C2818159r.A01();
                }
            }
        }
        return A09;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A01(this.A05) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(A00())) * 31) + C51971G9r.A0E(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A05, 0, 1);
        Pxj.A1B(parcel, this.A00, 0, 1);
        Pxj.A1B(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Iterator A0w = Pxj.A0w(parcel, this.A08);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public FBPayLoggerData(Parcel parcel) {
        String str = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = Pxi.A0e(parcel);
        HashSet A1F = AnonymousClass7TE.A1F();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1F.add(parcel.readString());
        }
        this.A08 = Collections.unmodifiableSet(A1F);
    }

    public FBPayLoggerData(C11249SHj sHj) {
        this.A05 = null;
        this.A00 = sHj.A00;
        this.A01 = sHj.A01;
        this.A06 = null;
        this.A02 = sHj.A02;
        this.A03 = sHj.A03;
        this.A07 = sHj.A04;
        this.A04 = sHj.A05;
        this.A08 = Collections.unmodifiableSet(sHj.A06);
    }
}
