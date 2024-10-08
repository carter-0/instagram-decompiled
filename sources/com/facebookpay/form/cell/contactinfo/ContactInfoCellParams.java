package com.facebookpay.form.cell.contactinfo;

import X.0qQ;
import X.QXR;
import X.SWV;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

public final class ContactInfoCellParams extends CellParams {
    public static final SWV CREATOR = SWV.A00(64);
    public int A00;
    public QXR A01;
    public QXR A02;
    public QXR A03;
    public boolean A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }
}
