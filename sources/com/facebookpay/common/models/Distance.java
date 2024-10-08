package com.facebookpay.common.models;

import X.0qQ;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.ptt.interfaces.SerializedName;

public final class Distance implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(81);
    @SerializedName("value")
    public final double A00;
    @SerializedName("unit")
    public final Integer A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        if (1 - this.A01.intValue() != 0) {
            str = "MILES";
        } else {
            str = "KILOMETERS";
        }
        parcel.writeString(str);
    }

    public Distance(Integer num, double d) {
        this.A00 = d;
        this.A01 = num;
    }
}
