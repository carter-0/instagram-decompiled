package com.facebookpay.form.cell.checkbox;

import X.0qQ;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

public final class CheckboxCellParams extends CellParams {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
