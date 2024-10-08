package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class Estimate extends AnonymousClass0T0 implements Parcelable, EstimateIntf {
    public static final Parcelable.Creator CREATOR = new DE7(62);
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Estimate) {
                Estimate estimate = (Estimate) obj;
                if (!(this.A00 == estimate.A00 && this.A01 == estimate.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public Estimate(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
