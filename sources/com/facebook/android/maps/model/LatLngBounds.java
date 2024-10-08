package com.facebook.android.maps.model;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.C51968G9o;
import X.Pxg;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class LatLngBounds implements Parcelable {
    public static final LatLngBounds A02 = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new SWS(9);
    public final LatLng A00;
    public final LatLng A01;

    public static double A00(double d, double d2) {
        double d3 = d - d2;
        int i = 0;
        if (d3 < 0.0d) {
            i = 360;
        }
        return d3 + ((double) i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.A00.equals(latLngBounds.A00) && this.A01.equals(latLngBounds.A01);
    }

    public final boolean A01(LatLng latLng) {
        double d = latLng.A00;
        LatLng latLng2 = this.A00;
        if (d > latLng2.A00) {
            return false;
        }
        LatLng latLng3 = this.A01;
        if (d < latLng3.A00) {
            return false;
        }
        double d2 = latLng3.A01;
        double d3 = latLng2.A01;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        double d4 = latLng.A01;
        int i2 = (d4 > d2 ? 1 : (d4 == d2 ? 0 : -1));
        if (i < 0) {
            if (i2 < 0) {
                return false;
            }
        } else if (i2 >= 0) {
            return true;
        }
        if (d4 <= d3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, (527 + this.A00.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append("{northeast=");
        sb.append(this.A00);
        sb.append(", southwest=");
        sb.append(this.A01);
        return AnonymousClass7TF.A0l("}", sb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public LatLngBounds(Parcel parcel) {
        Class<LatLng> cls = LatLng.class;
        this.A00 = (LatLng) C41847B3o.A03(parcel, cls);
        this.A01 = (LatLng) C41847B3o.A03(parcel, cls);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        double d = latLng.A00;
        double d2 = latLng2.A00;
        if (d <= d2) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Southern latitude (");
        sb.append(d);
        sb.append(") exceeds Northern latitude (");
        sb.append(d2);
        throw Pxg.A0d(").", sb);
    }
}
