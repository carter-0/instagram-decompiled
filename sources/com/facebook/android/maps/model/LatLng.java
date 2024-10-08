package com.facebook.android.maps.model;

import X.AnonymousClass7TF;
import X.C51968G9o;
import X.Pxd;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWS(8);
    public final double A00;
    public final double A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Math.abs(this.A00 - latLng.A00) < 0.002d && Math.abs(this.A01 - latLng.A01) < 2.0E-4d;
    }

    public final double A00(LatLng latLng) {
        double d = this.A00;
        double d2 = latLng.A00;
        return Math.sqrt(Math.pow(d - d2, 2.0d) + Math.pow((this.A01 - latLng.A01) * Math.cos(Math.toRadians(d2)), 2.0d)) * 110250.0d;
    }

    public final int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append("{latitude=");
        sb.append(this.A00);
        sb.append(Pxd.A00(325));
        sb.append(this.A01);
        return AnonymousClass7TF.A0l("}", sb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public LatLng(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public LatLng(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }
}
