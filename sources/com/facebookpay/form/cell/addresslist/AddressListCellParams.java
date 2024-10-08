package com.facebookpay.form.cell.addresslist;

import X.0qQ;
import android.os.Parcel;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

public final class AddressListCellParams extends CellParams {
    public int A00;
    public BaseCheckoutItem A01;
    public LoggingContext A02;
    public List A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
