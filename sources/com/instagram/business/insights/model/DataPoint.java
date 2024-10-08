package com.instagram.business.insights.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class DataPoint extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(6);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataPoint) {
                DataPoint dataPoint = (DataPoint) obj;
                if (this.A00 != dataPoint.A00 || !0qQ.A0K(this.A01, dataPoint.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public DataPoint(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
