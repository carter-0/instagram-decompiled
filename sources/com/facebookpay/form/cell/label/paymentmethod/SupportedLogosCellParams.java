package com.facebookpay.form.cell.label.paymentmethod;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;
import java.util.List;

public final class SupportedLogosCellParams extends CellParams {
    public static final SWV CREATOR = SWV.A00(70);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }
}
