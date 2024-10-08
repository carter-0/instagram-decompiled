package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.Pxj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class PointOfInterest implements Parcelable, PointOfInterestSpec {
    public static final Parcelable.Creator CREATOR = new SWZ(32);
    public final Location A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PointOfInterest) {
                PointOfInterest pointOfInterest = (PointOfInterest) obj;
                if (!0qQ.A0K(this.A01, pointOfInterest.A01) || !0qQ.A0K(this.A00, pointOfInterest.A00) || !0qQ.A0K(this.A02, pointOfInterest.A02) || !0qQ.A0K(this.A03, pointOfInterest.A03) || !0qQ.A0K(this.A04, pointOfInterest.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((C51971G9r.A0E(this.A01) + 31) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        Pxj.A1B(parcel, this.A02, 0, 1);
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
    }

    public PointOfInterest(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0W);
        String str = null;
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
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
    }

    public PointOfInterest(Location location, String str, String str2, String str3, String str4) {
        C11367SPk.A03(str, "fullAddress");
        this.A01 = str;
        this.A00 = location;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
