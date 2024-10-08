package com.facebookpay.form.cell.selector;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

public final class SelectorCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(74);
    public final int A00;
    public final int A01;
    public final String A02;
    public final int[] A03;
    public final int A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeIntArray(this.A03);
        parcel.writeInt(this.A01);
    }

    public SelectorCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int[] iArr = new int[readInt];
        this.A03 = iArr;
        parcel.readIntArray(iArr);
        this.A01 = parcel.readInt();
    }
}
