package com.facebookpay.form.cell.apm;

import X.0qQ;
import X.C10782Ry3;
import X.C8024QfE;
import X.SWV;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

public final class APMLinkCellParams extends CellParams {
    public static final SWV CREATOR = SWV.A00(62);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public APMLinkCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    public APMLinkCellParams(C8024QfE qfE) {
        super((C10782Ry3) qfE);
        this.A00 = 2131961367;
        this.A01 = qfE.A00;
    }
}
