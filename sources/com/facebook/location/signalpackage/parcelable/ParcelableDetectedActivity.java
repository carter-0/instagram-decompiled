package com.facebook.location.signalpackage.parcelable;

import X.C10400Rrc;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableDetectedActivity extends C10400Rrc implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(24);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10400Rrc)) {
            C10400Rrc rrc = (C10400Rrc) obj;
            return this.A01 == rrc.A01 && this.A00 == rrc.A00;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
