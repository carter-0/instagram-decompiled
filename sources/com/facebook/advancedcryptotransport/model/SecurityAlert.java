package com.facebook.advancedcryptotransport.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C41847B3o;
import X.C51971G9r;
import X.C66579MXk;
import X.C7216Pzk;
import X.Pxf;
import X.Pxh;
import X.Pxi;
import X.Pxj;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecurityAlert implements Parcelable {
    public static volatile Integer A07;
    public static volatile Integer A08;
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(88);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecurityAlert) {
                SecurityAlert securityAlert = (SecurityAlert) obj;
                if (!0qQ.A0K(this.A03, securityAlert.A03) || A00() != securityAlert.A00() || !0qQ.A0K(this.A01, securityAlert.A01) || !0qQ.A0K(this.A04, securityAlert.A04) || !0qQ.A0K(this.A05, securityAlert.A05) || A01() != securityAlert.A01()) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A06.contains(C66579MXk.A00(750))) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = AnonymousClass05K.A00;
                }
            }
        }
        return A07;
    }

    public final Integer A01() {
        if (this.A06.contains("platform")) {
            return this.A02;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = AnonymousClass05K.A00;
                }
            }
        }
        return A08;
    }

    public final int hashCode() {
        int intValue;
        int A012 = C11367SPk.A01(this.A03);
        int i = -1;
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        int A0E = (((((((A012 * 31) + intValue) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05);
        if (A01() != null) {
            i = A01().intValue();
        }
        return (A0E * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxf.A18(parcel, this.A03);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        Pxf.A19(parcel, this.A01);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        Iterator A0w = Pxj.A0w(parcel, this.A06);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public SecurityAlert(Parcel parcel) {
        Pxh.A1H(this);
        this.A03 = Pxi.A0T(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Pxi.A0S(parcel, 4);
        }
        this.A01 = C41847B3o.A12(parcel);
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
        this.A02 = parcel.readInt() != 0 ? Pxi.A0S(parcel, 4) : num;
        HashSet A1F = AnonymousClass7TE.A1F();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1F.add(parcel.readString());
        }
        this.A06 = Collections.unmodifiableSet(A1F);
    }
}
