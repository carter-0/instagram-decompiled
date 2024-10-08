package com.google.android.exoplayer2.metadata.icy;

import X.AnonymousClass4RQ;
import X.AnonymousClass7TE;
import X.C256683wB;
import X.C41848B3p;
import X.C66583MXo;
import X.JTR;
import X.Pxe;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(49);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.A00 != icyHeaders.A00 || !Util.A0I(this.A02, icyHeaders.A02) || !Util.A0I(this.A03, icyHeaders.A03) || !Util.A0I(this.A04, icyHeaders.A04) || this.A05 != icyHeaders.A05 || this.A01 != icyHeaders.A01) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final void E37(AnonymousClass4RQ r2) {
        String str = this.A03;
        if (str != null) {
            r2.A0D = str;
        }
        String str2 = this.A02;
        if (str2 != null) {
            r2.A0C = str2;
        }
    }

    public final int hashCode() {
        return ((((((((C66583MXo.A01(this.A00) + JTR.A0G(this.A02)) * 31) + JTR.A0G(this.A03)) * 31) + Pxh.A0B(this.A04)) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = C41848B3p.A1X(parcel);
        this.A01 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IcyHeaders: name=\"");
        A1A.append(this.A03);
        A1A.append("\", genre=\"");
        A1A.append(this.A02);
        A1A.append("\", bitrate=");
        A1A.append(this.A00);
        A1A.append(", metadataInterval=");
        return Pxe.A0z(A1A, this.A01);
    }
}
