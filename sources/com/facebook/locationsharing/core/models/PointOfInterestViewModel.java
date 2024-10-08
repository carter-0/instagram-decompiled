package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.C11367SPk;
import X.C51968G9o;
import X.C51971G9r;
import X.Pxj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class PointOfInterestViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWZ(33);
    public final double A00;
    public final double A01;
    public final String A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PointOfInterestViewModel(String str, String str2, String str3, String str4, double d, double d2, long j) {
        this.A03 = j;
        C11367SPk.A03(str, "fullAddress");
        this.A02 = str;
        this.A00 = d;
        this.A01 = d2;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PointOfInterestViewModel) {
                PointOfInterestViewModel pointOfInterestViewModel = (PointOfInterestViewModel) obj;
                if (this.A03 != pointOfInterestViewModel.A03 || !0qQ.A0K(this.A02, pointOfInterestViewModel.A02) || this.A00 != pointOfInterestViewModel.A00 || this.A01 != pointOfInterestViewModel.A01 || !0qQ.A0K(this.A04, pointOfInterestViewModel.A04) || !0qQ.A0K(this.A05, pointOfInterestViewModel.A05) || !0qQ.A0K(this.A06, pointOfInterestViewModel.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((C51968G9o.A03(this.A03) + 31) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A06);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        Pxj.A1B(parcel, this.A06, 0, 1);
    }

    public PointOfInterestViewModel(Parcel parcel) {
        getClass().getClassLoader();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        String str = null;
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
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
    }
}
