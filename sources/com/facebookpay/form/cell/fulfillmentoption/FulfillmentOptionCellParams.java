package com.facebookpay.form.cell.fulfillmentoption;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

public final class FulfillmentOptionCellParams extends CellParams {
    public static final SWV CREATOR = SWV.A00(67);
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
