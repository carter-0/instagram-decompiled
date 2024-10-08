package com.facebook.location.logging;

import X.C51968G9o;
import X.Pxh;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class MaxImpressionsPerInterval implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(16);
    public final int A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MaxImpressionsPerInterval) {
                MaxImpressionsPerInterval maxImpressionsPerInterval = (MaxImpressionsPerInterval) obj;
                if (!(this.A01 == maxImpressionsPerInterval.A01 && this.A00 == maxImpressionsPerInterval.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C51968G9o.A03(this.A01) + 31) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
    }

    public MaxImpressionsPerInterval(Parcel parcel) {
        Pxh.A1H(this);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
    }
}
