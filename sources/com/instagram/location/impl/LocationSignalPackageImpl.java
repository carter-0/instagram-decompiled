package com.instagram.location.impl;

import X.C276164sm;
import X.C71269Ogb;
import X.SG0;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.instagram.location.intf.LocationSignalPackage;

public class LocationSignalPackageImpl implements LocationSignalPackage {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(2);
    public final SG0 A00;

    public final int describeContents() {
        return 0;
    }

    public final Location BNg() {
        C276164sm r0 = this.A00.A02;
        if (r0 != null) {
            return new Location(r0.A00);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((LocationSignalPackageImpl) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableLocationSignalPackage.A00(this.A00), 0);
    }

    public LocationSignalPackageImpl(SG0 sg0) {
        this.A00 = sg0;
    }
}
