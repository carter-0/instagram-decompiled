package com.facebook.location.parcelable;

import X.C276164sm;
import X.C41847B3o;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableGeofenceResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(20);
    public final float A00;
    public final long A01;
    public final long A02;
    public final C276164sm A03;

    public final int describeContents() {
        return 0;
    }

    public ParcelableGeofenceResult(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        float readFloat = parcel.readFloat();
        this.A03 = (C276164sm) C41847B3o.A03(parcel, ParcelableImmutableLocation.class);
        this.A02 = readLong;
        this.A01 = readLong2;
        this.A00 = readFloat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((ParcelableImmutableLocation) this.A03, i);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeFloat(this.A00);
    }
}
