package com.facebookpay.form.cell.addresslist;

import X.0qQ;
import X.Pxf;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

public final class AddressListHeaderCellParams extends CellParams {
    public int A00;
    public int A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        if (num != null) {
            Pxf.A19(parcel, num);
        }
    }
}
