package com.facebook.advancedcryptotransport.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C51971G9r;
import X.C66581MXm;
import X.C7216Pzk;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PeerDevice implements Parcelable {
    public static volatile Integer A0E;
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(87);
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerDevice) {
                PeerDevice peerDevice = (PeerDevice) obj;
                if (!0qQ.A0K(this.A06, peerDevice.A06) || !0qQ.A0K(this.A03, peerDevice.A03) || !0qQ.A0K(this.A07, peerDevice.A07) || !0qQ.A0K(this.A08, peerDevice.A08) || this.A0D != peerDevice.A0D || !0qQ.A0K(this.A04, peerDevice.A04) || !0qQ.A0K(this.A00, peerDevice.A00) || !0qQ.A0K(this.A09, peerDevice.A09) || !0qQ.A0K(this.A01, peerDevice.A01) || !0qQ.A0K(this.A0A, peerDevice.A0A) || !0qQ.A0K(this.A0B, peerDevice.A0B) || A00() != peerDevice.A00() || !0qQ.A0K(this.A05, peerDevice.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A0C.contains("platform")) {
            return this.A02;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = AnonymousClass05K.A00;
                }
            }
        }
        return A0E;
    }

    public final int hashCode() {
        int intValue;
        int A002 = (((((((((((C11367SPk.A00((((((C11367SPk.A01(this.A06) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A08), this.A0D) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A0A)) * 31) + C51971G9r.A0E(this.A0B);
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((A002 * 31) + intValue) * 31) + C51971G9r.A0E(this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A06, 0, 1);
        Pxf.A18(parcel, this.A03);
        parcel.writeString(this.A07);
        Pxj.A1B(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0D ? 1 : 0);
        Pxf.A18(parcel, this.A04);
        Double d = this.A00;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            Pxg.A1H(parcel, d, 1);
        }
        Pxj.A1B(parcel, this.A09, 0, 1);
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            Pxg.A1H(parcel, d2, 1);
        }
        Pxj.A1B(parcel, this.A0A, 0, 1);
        Pxj.A1B(parcel, this.A0B, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        Pxf.A18(parcel, this.A05);
        Iterator A0w = Pxj.A0w(parcel, this.A0C);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public PeerDevice(Parcel parcel) {
        Integer num = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A03 = Pxi.A0T(parcel);
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A0D = C66581MXm.A1V(parcel.readInt());
        this.A04 = Pxi.A0T(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? Pxi.A0S(parcel, 4) : num;
        this.A05 = Pxi.A0T(parcel);
        HashSet A1F = AnonymousClass7TE.A1F();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1F.add(parcel.readString());
        }
        this.A0C = Collections.unmodifiableSet(A1F);
    }
}
