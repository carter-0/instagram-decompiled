package com.instagram.business.insights.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class GrowthDataPoint extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(9);
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthDataPoint) {
                GrowthDataPoint growthDataPoint = (GrowthDataPoint) obj;
                if (!(this.A00 == growthDataPoint.A00 && this.A01 == growthDataPoint.A01)) {
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

    public GrowthDataPoint(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
