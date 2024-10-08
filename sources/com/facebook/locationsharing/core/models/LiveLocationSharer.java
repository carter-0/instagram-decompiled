package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.C11367SPk;
import X.C51968G9o;
import X.C51971G9r;
import X.Pxf;
import X.SWZ;
import X.XDX;
import android.os.Parcel;
import android.os.Parcelable;

public class LiveLocationSharer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWZ(28);
    public final long A00;
    public final Location A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveLocationSharer) {
                LiveLocationSharer liveLocationSharer = (LiveLocationSharer) obj;
                if (this.A00 != liveLocationSharer.A00 || !0qQ.A0K(this.A02, liveLocationSharer.A02) || !0qQ.A0K(this.A01, liveLocationSharer.A01) || !0qQ.A0K(this.A03, liveLocationSharer.A03) || !0qQ.A0K(this.A04, liveLocationSharer.A04) || !0qQ.A0K(this.A05, liveLocationSharer.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public LiveLocationSharer(Location location, String str, long j) {
        String A002 = XDX.A00(19, 8, 21);
        this.A00 = j;
        this.A02 = "";
        this.A01 = location;
        this.A03 = null;
        C11367SPk.A03(str, "userId");
        this.A04 = str;
        C11367SPk.A03(A002, "userName");
        this.A05 = A002;
    }

    public final int hashCode() {
        return ((((((((((C51968G9o.A03(this.A00) + 31) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        String str = this.A03;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public LiveLocationSharer(Parcel parcel) {
        String readString;
        ClassLoader A0W = Pxf.A0W(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A01 = (Location) parcel.readParcelable(A0W);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A03 = readString;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }
}
