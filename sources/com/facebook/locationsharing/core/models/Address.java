package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.AnonymousClass000;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(26);
    public final Location A00;
    public final String A01;
    public final boolean A02;

    public Address(Location location, String str) {
        this.A02 = false;
        C11367SPk.A03(str, AnonymousClass000.A00(1558));
        this.A01 = str;
        C11367SPk.A03(location, "location");
        this.A00 = location;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (this.A02 != address.A02 || !0qQ.A0K(this.A01, address.A01) || !0qQ.A0K(this.A00, address.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((((i + 31) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public Address(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        this.A02 = Pxg.A1U(parcel);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0W);
    }
}
