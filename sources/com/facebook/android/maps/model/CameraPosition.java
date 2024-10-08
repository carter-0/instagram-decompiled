package com.facebook.android.maps.model;

import X.AnonymousClass7TF;
import X.C41847B3o;
import X.C51968G9o;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWS(7);
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.A00 == cameraPosition.A00) {
            LatLng latLng = this.A03;
            LatLng latLng2 = cameraPosition.A03;
            if (latLng != null) {
                return latLng.equals(latLng2) && this.A01 == cameraPosition.A01 && this.A02 == cameraPosition.A02;
            }
            if (latLng2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        float f;
        LatLng latLng = this.A03;
        if (latLng != null) {
            f = 527.0f + ((float) latLng.hashCode());
        } else {
            f = 17.0f;
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append("{target=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A02);
        sb.append(", tilt=");
        sb.append(this.A01);
        sb.append(", bearing=");
        sb.append(this.A00);
        return AnonymousClass7TF.A0l("}", sb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public CameraPosition(Parcel parcel) {
        this.A03 = (LatLng) C41847B3o.A03(parcel, LatLng.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.A03 = latLng;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
