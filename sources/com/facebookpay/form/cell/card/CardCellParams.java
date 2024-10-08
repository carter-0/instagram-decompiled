package com.facebookpay.form.cell.card;

import X.0qQ;
import X.C8029QfJ;
import X.C8046Qfr;
import android.os.Parcel;
import com.facebookpay.form.cell.text.TextCellParams;
import java.util.List;

public final class CardCellParams extends TextCellParams {
    public final int A00;
    public final List A01;
    public final boolean A02;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public CardCellParams(C8046Qfr qfr) {
        super((C8029QfJ) qfr);
        this.A01 = qfr.A01;
        this.A00 = qfr.A00;
        this.A02 = qfr.A02;
    }
}
