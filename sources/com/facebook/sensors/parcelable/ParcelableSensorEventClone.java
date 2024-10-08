package com.facebook.sensors.parcelable;

import X.0qQ;
import X.C10678RwH;
import X.C51972G9s;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ParcelableSensorEventClone extends C10678RwH implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(48);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10678RwH)) {
            return false;
        }
        C10678RwH rwH = (C10678RwH) obj;
        if (this.A00 == rwH.A00 && this.A01 == rwH.A01 && this.A02 == rwH.A02) {
            return Arrays.equals(this.A03, rwH.A03);
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A02);
        float[] fArr = this.A03;
        parcel.writeInt(fArr.length);
        parcel.writeFloatArray(fArr);
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A02, ((this.A00 * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }
}
