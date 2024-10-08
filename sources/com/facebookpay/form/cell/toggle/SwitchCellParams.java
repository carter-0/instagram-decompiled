package com.facebookpay.form.cell.toggle;

import X.AnonymousClass7TF;
import X.C10782Ry3;
import X.C8025QfF;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

public class SwitchCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(83);
    public final int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public SwitchCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = AnonymousClass7TF.A1P(parcel.readByte());
        this.A00 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
    }

    public SwitchCellParams(C8025QfF qfF) {
        super((C10782Ry3) qfF);
        this.A01 = qfF.A00;
        this.A00 = 2131954883;
    }
}
