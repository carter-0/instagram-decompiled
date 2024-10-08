package com.facebook.common.util;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class Triplet extends ParcelablePair implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(77);
    public final Object A00;

    public Triplet(Object obj, Object obj2, Object obj3) {
        super(obj, obj2);
        this.A00 = obj3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
