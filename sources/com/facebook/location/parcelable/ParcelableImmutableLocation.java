package com.facebook.location.parcelable;

import X.C276164sm;
import X.Pxh;
import X.SWZ;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableImmutableLocation extends C276164sm implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C276164sm)) {
            return false;
        }
        Location location = this.A00;
        double latitude = location.getLatitude();
        Location location2 = ((C276164sm) obj).A00;
        return Double.compare(latitude, location2.getLatitude()) == 0 && Double.compare(location.getLongitude(), location2.getLongitude()) == 0 && Float.compare(location.getAccuracy(), location2.getAccuracy()) == 0 && location.getTime() == location2.getTime();
    }

    public final int hashCode() {
        Location location = this.A00;
        long doubleToLongBits = Double.doubleToLongBits(location.getLatitude());
        int A06 = Pxh.A06((long) Float.floatToIntBits(location.getAccuracy()), Pxh.A06(Double.doubleToLongBits(location.getLongitude()), (527 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) * 31);
        long time = location.getTime();
        return (A06 * 31) + ((int) ((time >>> 32) ^ time));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte booleanValue;
        parcel.writeParcelable(new Location(this.A00), i);
        Boolean bool = this.A01;
        if (bool == null) {
            booleanValue = 2;
        } else {
            booleanValue = bool.booleanValue();
        }
        parcel.writeByte(booleanValue);
    }
}
