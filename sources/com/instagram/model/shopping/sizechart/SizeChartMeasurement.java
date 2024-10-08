package com.instagram.model.shopping.sizechart;

import X.0qQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class SizeChartMeasurement implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(37);
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            parcel.writeByte((byte) 1);
            parcel.writeInt(intValue);
        } else {
            parcel.writeByte((byte) 0);
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            parcel.writeByte((byte) 1);
            parcel.writeInt(intValue2);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.A03);
    }
}
