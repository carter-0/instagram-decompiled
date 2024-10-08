package com.facebook.cellinfo.parcelable;

import X.SWS;
import X.XnC;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableCdmaCellInfo extends XnC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWS(62);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A04);
    }
}
