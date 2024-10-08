package com.facebook.common.util;

import X.002;
import X.C51968G9o;
import X.Qz1;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;

public class ParcelablePair extends Pair implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(75);

    public final int describeContents() {
        return 0;
    }

    public final Object[] A00() {
        if (!(this instanceof Triplet)) {
            return new Object[]{this.first, this.second};
        }
        Triplet triplet = (Triplet) this;
        if (!(triplet instanceof Quartet)) {
            return new Object[]{triplet.first, triplet.second, triplet.A00};
        }
        Quartet quartet = (Quartet) triplet;
        return new Object[]{quartet.first, quartet.second, quartet.A00, quartet.A00};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParcelablePair)) {
            return false;
        }
        return Arrays.equals(A00(), ((ParcelablePair) obj).A00());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.first);
        parcel.writeValue(this.second);
    }

    public final int hashCode() {
        return Arrays.hashCode(A00());
    }

    public final Iterator iterator() {
        return new Qz1(A00());
    }

    public final String toString() {
        return 002.A0R(C51968G9o.A16(this), Arrays.toString(A00()));
    }
}
